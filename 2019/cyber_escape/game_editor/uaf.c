/**
 * Filename: uaf.c
 * Author: Romain Bentz (pixis)
 * Description: Pown challenge for CTF Sogeti
 * Usage: ./uaf
 * Compilation: gcc -fPIE -fstack-protector-all -D_FORTIFY_SOURCE=2 -Wl,-z,now -Wl,-z,relro -o uaf uaf.c
 **/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_NAME_SIZE   16

typedef struct player {
  char name[MAX_NAME_SIZE];
  int64_t isAdmin;
} player_t;

char *game_title=NULL;

/*
Prevent double free
*/
int is_player_freed=1;
int is_title_freed=1;


int main(int Count, char *Strings[])
{
    char line[128];
    player_t *player = NULL;
    while(1) {
        printf(
            "  _______ _    _ ______    _____          __  __ ______ \n"
            " |__   __| |  | |  ____|  / ____|   /\\   |  \\/  |  ____|\n"
            "    | |  | |__| | |__    | |  __   /  \\  | \\  / | |__   \n"
            "    | |  |  __  |  __|   | | |_ | / /\\ \\ | |\\/| |  __|  \n"
            "    | |  | |  | | |____  | |__| |/ ____ \\| |  | | |____ \n"
            "    |_|  |_|  |_|______|  \\_____/_/    \\_\\_|  |_|______|\n"
            "                                                        \n"
            "                                                        \n"
            "\n"
            "Game information\n"
            "----------------\n"
            "\tPlayer name\t-->\t%s\n"
            "\tGame title\t-->\t%s\n"
            "\n"
            "Commands\n"
            "--------\n"
            "\tset <Player name>\t-\tSet player's name\n"
            "\ttitle <Game title>\t-\tSet game's title\n"
            "\tdel\t\t\t-\tDelete player's name\n"
            "\tlogin\t\t\t-\t[ADMIN AREA] Login into the game\n"
            "\texit\t\t\t-\tExit :(\n"
            "\n"
            "> ",
            player == NULL ? "(Not set)" : player->name, game_title == NULL ? "(Not set)" : game_title);

        if (fgets(line, sizeof(line), stdin) == NULL) break;


        if (strncmp(line, "set ", 4) == 0) {
            if (strlen(line + 4) > 1 && strlen(line + 4) <= MAX_NAME_SIZE) {
                // Free old player if set
                if (player != NULL && is_player_freed == 0) {
                    free(player);
                    is_player_freed = 1;
                }
                player = malloc(sizeof(player_t));

                // Fresh new player
                memset(player, 0, sizeof(player_t));

                is_player_freed = 0;

                // Replace trailing \n with \0
                strncpy(player->name, line + 4, strlen(line+4)-1);
                player->name[strlen(line+4)] = 0;

                // You're not admin, duh.
                player->isAdmin = 0;
            } else {
                printf("Maximum name size is %d characters\n", MAX_NAME_SIZE-1);
            }
        }

        if (strncmp(line, "title ", 6) == 0) {
            // Free old title if set
            if (game_title != NULL && is_title_freed == 0) {
                free(game_title);
                is_title_freed = 1;
            }

            game_title = strndup(line+6, strlen(line+6)-1);
            printf("game_title is %p\n", game_title);
            is_title_freed = 0;
        }

        if (strncmp(line, "del", 3) == 0) {
            // Free player if set
            if (player != NULL && is_player_freed == 0) {
                free(player);
                printf("player is %p\n", player);
                is_player_freed = 1;
            }
        }

        if (strncmp(line, "login", 5) == 0) {
            // If you're admin, go get your cookie !
            if (player != NULL) {
                printf("%s\n", player->isAdmin == 0 ? "Nop" : "SCE{flag}");
            }
        }

        if (strncmp(line, "exit", 4) == 0) {
            // Exit nicely without memory leaks
            if (player != NULL && is_player_freed == 0) {
                free(player);
            }
            if (game_title != NULL && is_title_freed == 0) {
                free(game_title);
            }

            // I'm quite polite.
            printf("'k Bye !\n");

            return EXIT_SUCCESS;
        }
    }
    return EXIT_SUCCESS;
}
