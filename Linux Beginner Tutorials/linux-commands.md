| Command | Description |
| ------- | ----------- |
| cd / | main "root" directory |
| cd or cd ~ | user's "home" directory |
| cd .. | one level up |
| cd ../.. | two level up |
| 'cd -' | switch to last dir |
| ls | list of directory |
| ls -a | list with hided .dir |
| ls dir | list this dir |
| ls -l | more detailed view |
| ll or ls -la | list all |
| /bin | users commands |
| /etc | configurations files for Linux |
| /dev | devices |
| /boot | location of the kernel |
| /root | access oonly for admin |
| /sbin | frequently used programms, only for admin |
| /tmp | for temporary files |
| /var | for files that may change their size |
| /lib | for library files |
| /home | also that "cd" command directory |
| /mnt, cdrom | flash-disk, cdrom |
| FHS | [FHS - Filesystem Hierarchy Standard](https://ru.wikipedia.org/wiki/FHS) |
| cat | view file |
| head | first 10 strings of file |
| tail | last 10 strings of file |
| head tail -n num | view num strings of file |
| tail -f | wait and view for change of file |
| less | view file, q quit; f forward; b back; / find, n next, N last |
| last | the people who have logged |
| df | used hard disk space |
| free | used RAM memory |
| free -m | used RAM in megabytes |
| du file_name | size of file |
| du -b file_name | size of file in bytes |
| du -h file_name | size of file for human ) |
| du -s | size of current dir |
| du -sh\* | sizes of dirs in current dir |
| top | top weight running processes |
| ps | all running processes |
| ps -u | all running processes for user |
| ps -au | all running processes for all user |
| kill PID | kill the process |
| killall name | also kill the process |
| sudo apt autoremove | remove packages no longer required |
| shutdown -h now | power off |
| shutdown -r now | reboot |
| shutdown -h 20:01 | power off at time |
| shutdown -h +5 | power off in 5 minutes |
| ; | running multiple commands in one single command |
| && | running multiple commands in one single command only if the previous command was successful |
| ctrl+r | easily search and use the commands that you had used in the past |
| ctrl+s | freeze terminal but commands will run after unfreeze ctrl+q |
| ctrl+a ctrl+e | move to beginning or end of line |
| z-commands | reading compressed logs without extracting |
| !$ | reuse the last item from the previous command |
| !! | use last command as an argument |
| alias unalias | you may use alias |
| yes \| command | using yes command for commands or scripts that need interactive response |
| \> filename | empty a file without deleting it |
| grep | find text into files, -B -A -C output strings before after around, -R find into all dir inside parent, -n add number of strings |
| find | find file [Find](https://ru.wikipedia.org/wiki/Find) |
| wc | count words, strings, chars |
| flows | STDIN - 0 wc -l < result STDOUT - 1 ls -la > output for rewrite >> STDERR | 2  cd lala > output 2>&1 or cd lala &> output |
| pipeline | cat sourse \| grep Dog \| uniq \| sort |
| touch | make file |
| rm | del file |
| mv | rename or move file |
| cp | copy file |
| cp -r | copy dir |
| mkdir | make dir |
| mkdir -p | make some dir recursivly |
| rm -r | del some dir, -f no questions |
| env | environment variables |
| echo $HOME | show variable |
| HOME=/tmp cd | change localy |
| export HOME=/tmp | change globaly |
| $HISTFILESIZE | param of env, how many commands save |
| history | view last commands |
| !num | last command num of string in history |
| whoami | who am I? |
| id or cat /etc/passwd | view my identificator |
| stat | statistic of file |
| sudo -u user | not root user |
| sudo -i | new root session for many commands, exit for exit |
| sudoedit file | edit for root |
| permissions | r read, w write, x execute drwxr-xr-x 775, -rw-r--r-- 644 |
| chown | change owner |
| chmod | change mode |
| sudo apt install prog | install prog |
| apt remove prog | remove prog |
| sudo apt update | update |
| $PATH | where system finds progs |
| type, whereis, which, ls -al /bin | grep prog - where is progs |
| ./executable | run prog from this dir |
| cal | calendar |
| useradd user | add user |
| passwd user | add password |
| pico, joe, vi | text editors |
| clear | ctrl + l |
| tar -cvf test.tar | create verbose file, all dir and files, don't compress tarball |
| gzip | compress files |
| tar -czvf test.tar.gz | tar plus gzip |
| tar -zxvpf test.tar.gz | untar plus unzip |
| gunzip | unzip |
| xdg-open | file, http, mailto |
| vlc, shotwell | viseo, pics |
| cat file - grep string | find string in file |
