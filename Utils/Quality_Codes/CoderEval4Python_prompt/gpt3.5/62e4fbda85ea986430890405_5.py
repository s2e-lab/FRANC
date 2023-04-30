import subprocess
import itertools


def xargs(command, args, color=False, target_concurrency=None):
    """
    Run a command with arguments passed through xargs.
    
    :param command: The command to run
    :param args: The arguments to pass to xargs
    :param color: Make a pty if on a platform that supports it
    :param target_concurrency: Target number of partitions to run concurrently
    """
    if color:
        subprocess_args = [
            'xargs',
            '-P', str(target_concurrency or 1),
            '-t',
            '--color=always',
            '-I', '{}',
            command
        ]
    else:
        subprocess_args = [
            'xargs',
            '-P', str(target_concurrency or 1),
            '-t',
            '-I', '{}',
            command
        ]

    proc = subprocess.Popen(
        subprocess_args,
        stdin=subprocess.PIPE,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
    )

    # Create an iterable that provides each argument as a single item.
    # If any of them are iterable, they will be exploded and wrapped up as part of the iterable.
    args_iterable = itertools.chain.from_iterable(
        arg if not isinstance(arg, str) and hasattr(arg, '__iter__') else (arg,) for arg in args
    )

    for arg in args_iterable:
        proc.stdin.write(f'{arg}\n'.encode())

    proc.stdin.close()
    proc.wait()

    return proc.returncode, proc.stdout.read(), proc.stderr.read()
