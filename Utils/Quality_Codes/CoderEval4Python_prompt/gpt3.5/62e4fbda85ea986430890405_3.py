import subprocess
import shlex
import os

def xargs(command, args, color=False, target_concurrency=1):
	"""
	Run a command with arguments provided via standard input.
	
	:param command: The command to run.
	:param args: A list of arguments to provide to the command.
	:param color: If True, use a pty to support colored output.
	:param target_concurrency: Target number of partitions to run concurrently.
	:return: CompletedProcess instance containing a command's output, return code and other information.
	"""
	
	# If the platform supports a pty, use it to support colored output
	if color and hasattr(subprocess, 'PTY'):
		pty=True
	else:
		pty=False
	
	# Divide the input arguments into partitions based on the target concurrency
	input_partitions = [args[i:i+target_concurrency] for i in range(0, len(args), target_concurrency)]
	
	# Iterate through each input partition
	for partition in input_partitions:
		# Build the command with the current partition of input arguments
		cmd = "{0} {1}".format(command, ' '.join(partition))
		
		# Use shlex to split the command into arguments
		parsed_cmd = shlex.split(cmd)
		
		# Open a subprocess to run the command with the current partition of input arguments
		process = subprocess.Popen(parsed_cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE, stdin=subprocess.PIPE, bufsize=-1, close_fds=True, preexec_fn=os.setsid, start_new_session=True, executable=None, cwd=None, env=os.environ, universal_newlines=False, shell=False, encoding=None, errors=None, text=None, umask=None, pty=pty)
		
		# Communicate with the subprocess by providing input from the current partition of input arguments
		output, errors = process.communicate(input='\n'.join(partition))
		
		# Print any output and errors from the subprocess
		if output:
			print(output)
		
		if errors:
			print(errors)
	
	return process
