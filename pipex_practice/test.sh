# fork
# gcc -Wall -Wextra -Werror main_fork.c -o main_fork
# ./main_fork
# rm -rf main_fork

# wait
# gcc -Wall -Wextra -Werror main_wait.c -o main_wait
# ./main_wait
# rm -rf main_wait

# manualpipe
# gcc -Wall -Wextra -Werror main_manualpipe.c -o main_manualpipe
# ./main_manualpipe
# rm -rf main_manualpipe

# fork2
# gcc -Wall -Wextra -Werror main_fork2.c -o main_fork2
# ./main_fork2
# rm -rf main_fork2

# execve
# gcc -Wall -Wextra -Werror for_execve.c -o for_execve
# gcc -Wall -Wextra -Werror main_execve.c -o main_execve
# ./main_execve
# rm -rf for_execve
# rm -rf main_execve

# id
# gcc -Wall -Wextra -Werror main_id.c -o main_id
# ./main_id
# rm -rf main_id

# pipe
# gcc -Wall -Wextra -Werror main_pipe.c -o main_pipe
# ./main_pipe
# rm -rf main_pipe

# forkpipe
# gcc -Wall -Wextra -Werror main_forkpipe.c -o main_forkpipe
# ./main_forkpipe
# rm -rf main_forkpipe

# fifo
# gcc -Wall -Wextra -Werror main_fifo.c -o main_fifo
# ./main_fifo
# rm -rf main_fifo myfifo1 myfifo

# test system pipe
# < file1 grep test | wc -l > file2
cat << eof | wc -l >> file2
