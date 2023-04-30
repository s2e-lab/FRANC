import subprocess
import shlex

def xargs(command, args, color=False, target_concurrency=1):
    # split command and args into a list
    command_args = shlex.split(command)
    # loop through each arg
    for arg in args:
        # create the command to execute
        execution = command_args + [arg]
        # if color is enabled, include the option to use a pty
        if color:
            execution = ["script", "-q", "-c", "'{}'".format(" ".join(execution)), "/dev/null"]
        # run the command
        subprocess.run(execution, check=True)
