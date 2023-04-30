def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	parser = argparse.ArgumentParser(description=__doc__)
	parser.add_argument("-g", "--grep", required=True,
							help="use this argument to set the Glob in the answer file")
	parser.add_argument("-a", "--analyze", action="store_true", default=False,
								help="use this argument to set the Analyze in answer file. Default is to not analyze.")

	args = parser.parse_args(self.__args)

	if not args.grep:
		args.grep = []
		
	