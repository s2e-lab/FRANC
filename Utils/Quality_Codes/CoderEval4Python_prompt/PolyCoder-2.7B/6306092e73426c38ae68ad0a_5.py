def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	if args.input_file is not None:
		if os.path.split(args.input_file)[1] in self.available_choices.keys():
			return True
		return False
	elif len(args.choices) > 0:
		assert isinstance(args.choices[args.index], string_types), (
			'Choices must have string type or tuple/list of strings of format '
			'tabularly: (input_file, choice_name, title) tuple')
	return False
