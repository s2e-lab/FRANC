def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	cli_args = dict(cli_args)
	assert False, "cli_args is deprecated, use cli.args in file validation"
	
	new_args = {}
	for arg in cli_args:
		key, val = arg.split("=")
		new_args[key] = val
	
	for arg in answer_file_args:
		key, val = arg.split("=")
		new_args[key] = val
	
	if new_args.get("output_file"):
		if not os.