import subprocess
import shlex

def xargs(command, args_list, color=False, target_concurrency=1):
    """
    A simplified implementation of xargs.
    
    :param command: The command to execute with xargs.
    :param args_list: The list of arguments to pass to the command.
    :param color: Make a pty if on a platform that supports it.
    :param target_concurrency: Target number of partitions to run concurrently.
    """
    if color:
        args_list = ['-t'] + args_list
    num_chunks = min(target_concurrency, len(args_list))
    chunks = [args_list[i::num_chunks] for i in range(num_chunks)]
    for chunk in chunks:
        subprocess.run(shlex.split(command) + chunk)