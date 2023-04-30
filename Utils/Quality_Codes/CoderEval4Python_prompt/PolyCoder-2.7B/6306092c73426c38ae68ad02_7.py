def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	errors = []
	valid_args = ["--user"]

	for index in cli_args:
		if index in self._DEPRECATED_PARAMETERS:
			if not hasattr(self, index):
				values = cli_args[index]
				if not len(values): continue
				option = values[0]
				if value := values[1: len(values)]; value == '' or value == '.':
					errors.append("  - "+option+": must not contains a value")

		elif index in answer_file_args