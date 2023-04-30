def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	cli_args['--version'] = __version__

	# get the arg parser object
	argparsers = cli_args.get('argparsers', self.arg_parsers)

	# print the argparser list
	print('\n'.join(argparsers), file=sys.stderr)

	# print the argparser output
	if self.json_arg:
		print('{%s}: %s'	% (argparsers.get('description').__name__, argparsers.get('help')))
	else:
		print(str(argparsers