int check_valid_fd(int fd) {
    int ok = read(fd,0,0);
    if(ok != -1) 
        return 1;
    else
        return 0;
}

int main() {
    int ok;
    int not_ok;
    char c;

    // last node
    not_ok = check_valid_fd(0);
    ok = check_valid_fd(1);
    if (ok == 1 && not_ok == 0) {
        int fd = open("flag.txt",0);
        ok = read(fd,&c,1);
        while(ok == 1) {
            write(1,&c,1);
            ok = read(fd,&c,1);
        }
    }
    else {
        int in = 0;
        int out = 0;

        // first node?
        ok = check_valid_fd(27);
        if(ok == 1) {
            connect_uni(0,27);
            connect_uni(27,1);
        }
        else {
            // between first and last node
            int fds[6][2] = {
                {28,29},
                {30,31},
                {31,21},
                {22,38},
                {37,17},
                {18,19}
            };
            int arr[6] = {29,31,21,38,17,19};
            for(int i=0;i<=6;i++) {
                ok = check_valid_fd(arr[i]);
                if(ok == 1) {
                    in = fds[i][0];
                    out = fds[i][1];
                    break;
                }
            }
            connect_bi(in,out);
        }
    }
}
