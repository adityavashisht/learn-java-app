After downloading you will copy the "bin/lib" folder

We need to be able to invoke the "migrate" command from the shell.

To do that:
1.) Create a shell/bat script that has the following variables:

MIGRATIONS_HOME=This should point to the directory where you have unpacked the zip
PATH= $MIGRATIONS_HOME/bin:PATH

2.) Source the shell file using : source path_to_shell_file, this command will import the variables in the current shell.

RUn "migrate" to verify that the shell can find the migrate command.