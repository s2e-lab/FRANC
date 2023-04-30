def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	arg_map_arg_keys = self.arg_map_arg_def.keys()
	if not arg_map_arg_keys:
		print("ERROR: You have to specify at least one argument to compare with -o or --output" )
		print("")
		print("Example of arguments:")
		answer_file_arg_keys = self.arg_map_answer_file_arg_def.keys()
		if not answer_file_arg_keys:
			print("ERROR: You have to specify at least one answer file argument