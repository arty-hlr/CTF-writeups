#include <nostdlib/all.h>

// int log_level = LOG_NONE;

int incoming_fd = INCOMING_FD;

ssize_t write_stdout(const void *buf, size_t count) {
    return writeall(incoming_fd, buf, count);
}

int connect_std(int fd) {
    char buf[0x10000];
    fd_set fds;

    int fd_max = fd;

    while (true) {
        // init fds
        FD_ZERO(&fds);
        FD_SET(fd, &fds);
        FD_SET(0, &fds);

        // wait for one fd to become ready for reading
        if (!RET_ON_ERR(sys_select(fd_max + 1, &fds, NULL, NULL, NULL)))
            continue;

        // read from fd1, write to fd2
        if (FD_ISSET(fd, &fds)) {
            ssize_t r = sys_read(fd, buf, sizeof buf);
            debug("Read %d bytes from fd", r);

            if (r <= 0)
                ;
            else
                writeall(1, buf, r);
        }

        // read from fd2, write to fd1
        if (FD_ISSET(0, &fds)) {
            ssize_t r = sys_read(0, buf, sizeof buf);
            debug("Read %d bytes from 0", r);

            if (r <= 0)
                ;
            else
                writeall(fd, buf, r);
        }
    }

    return 0;
}

bool is_valid(int fd) {
    return sys_read(fd, NULL, 0) == 0;
}

int get_valid_fd(void) {
    for (int fd = 100; fd > 2; fd--) {
        if (fd != incoming_fd && is_valid(fd))
            return fd;
    }
    return -1;
}

int main(void) {
    log("started");

    if (is_valid(1)) {

        if (!is_valid(0)) {
            // last node
            int fd = CHECK(sys_open("flag.txt", O_RDONLY, 0));
            char buf[0x100];
            size_t r = CHECK(sys_read(fd, buf, sizeof buf));
            write_stdout(buf, r);
            log("valid fd: asd");
            return 0;

        } else {
            // first node
            int fd = is_valid(3) ? 3 : 27;
            log("valid fd: %d", fd);
            CHECK(connect_std(fd));
            fatal("failed");
        }
    }

    size_t count = 0;
    for (int fd = 100; fd >= 0; fd--) {
        if (is_valid(fd)) {
            log("valid %d", fd);
            count++;
        }
    }
    log("done");

    if (count != 2) {
        fatal("count != 2  valid fd: asd");
    }
    int fd = get_valid_fd();
    log("valid fd: %d", fd);
    CHECK(connect_fds(fd, incoming_fd));

    // if (out_fd == 1) {
    //     log("valid fd: %d", 27);
    //     CHECK(connect_std(27));
    //     return 0;
    // }

    // // int fd = CHECK(get_valid_fd());
    // // log("valid fd: %d", fd);
    // // if (out_fd == 1) {
    // //     CHECK(connect_std(fd));
    // // } else {
    // //     CHECK(connect_fds(fd, out_fd));
    // // }

    // int fds[6][2] = {{28, 29}, {30, 31}, {32, 21}, {22, 38}, {37, 17}, {18, 19}};
    // int arr[6] = {29, 31, 21, 38, 17, 19};
    // for (int i = 0; i <= 6; i++) {
    //     if (sys_read(arr[i], NULL, 0) == 0) {
    //         int in = fds[i][0];
    //         int out = fds[i][1];
    //         ASSERT(in == out_fd || out == out_fd);
    //         log("valid fd: %d", in == out_fd ? out : in);
    //         CHECK(connect_fds(in, out));
    //         break;
    //     }
    // }

    // log("valid fd: asd");
    log("failed");
}
