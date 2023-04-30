def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	assert len(
			cli_args
		) > 0, '"cli_args" argument must not be empty'
	assert len(
			answer_file_args
		) > 0, '"answer_file_args" argument must not be empty'
	assert len(self.cli_args) > 0, "No argument were selected"
	assert len(self.answer_file_args) > 0, "No argument were selected"

	missing_values = False

	old_answer_file_args = answer_file_args

