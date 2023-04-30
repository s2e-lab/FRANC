import subprocess

def xargs(command, arguments, color=False, target_concurrency=1):
	"""
	Run the command with the provided arguments using xargs approach.
	
	Args:
		command (str): Command to execute.
		arguments (list): List of arguments to pass to the command. Each argument should be a separate element in the list.
		color (bool): Optional. True if colored output required.
		target_concurrency (int): Optional. Target number of partitions to run concurrently.
	Returns:
		None 
	"""
	
	# Check if command and arguments are provided
	if not command or not arguments:
		raise ValueError("Command and arguments must be given.")

	# Create an array of commands by appending command with each of the arguments
	command_array = [command] + arguments

	# Prepare the pty argument if required
	if color:
		pty_arg = '-o'
	else:
		pty_arg = ''

	# Set the maximum number of concurrent partitions to run
	max_partitions = min(len(arguments), target_concurrency)

	# Run the commands using subprocess.Popen() with the xargs approach
	with subprocess.Popen(
			['xargs', '-P', str(max_partitions), '-n', '1', '-I', '{}', 'sh', '-c', '{}'] + [pty_arg] + command_array,
			stdin=subprocess.PIPE
	) as process:
		# Pass the arguments to xargs process' stdin	
		process.communicate(input='\n'.join(arguments).encode())
