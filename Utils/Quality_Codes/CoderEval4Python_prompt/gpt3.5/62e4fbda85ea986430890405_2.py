import subprocess

def xargs(command, arguments, color=False, target_concurrency=1):
    # Determine the platform and update the command accordingly
    if color and sys.platform == 'darwin':
        command = f'script -q /dev/null {command}'
    elif color and sys.platform.startswith('linux'):
        command = f'script -qec "{command}" /dev/null'
    
    # Run the command using subprocess
    cmd_parts = [command] + arguments
    subprocess.run(cmd_parts, shell=True, check=True)