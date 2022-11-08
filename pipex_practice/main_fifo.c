#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <errno.h>

int main(int argc, char* argv[]) {
	(void)argc;
	(void)argv;

    mkfifo("myfifo1", 0777);
    printf("Opening...\n");
    int fd = open("myfifo1", O_WRONLY);
    printf("Opened\n");
    int x = 97;
    write(fd, &x, sizeof(x));
    printf("Written\n");
    close(fd);
    printf("Closed\n");
    return 0;
}
