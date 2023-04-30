def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	print_options_header
	options = [
		'-h', '-w', '-w', '-d', '-s', '-s', '-q', '-T', '-e', '-E', '-C',
		'-C', '-g', '-F', '-L', '-l', '-D', '-u', '-g', '-P'
	]
	print_options(options)
	
	if '--version' in cli_args:
		print_cli_version()
	
	args = cli_args
	if not args['-c']:
	