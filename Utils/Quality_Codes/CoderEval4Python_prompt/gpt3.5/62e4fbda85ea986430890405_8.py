import subprocess
import shlex

def xargs(command, args, color=False, target_concurrency=1):
    """
    Run a command with arguments using xargs-like functionality.
    """
    command_args = shlex.split(command) + args
    command_args_str = " ".join(command_args)
    subprocess_args = {
        'args': command_args_str,
        'shell': True,
        'stdout': subprocess.PIPE,
        'stderr': subprocess.PIPE,
        'stdin': subprocess.PIPE,
        'universal_newlines': True,
    }
    if color and hasattr(subprocess, 'PTY'):
        subprocess_args['stdin'] = subprocess.PTY
        subprocess_args['stdout'] = subprocess.PTY
        subprocess_args['stderr'] = subprocess.PTY
    pipes = subprocess.Popen(**subprocess_args)
    for line in iter(pipes.stderr.readline, ''):
        print(line, end='')
    return pipes.communicate()