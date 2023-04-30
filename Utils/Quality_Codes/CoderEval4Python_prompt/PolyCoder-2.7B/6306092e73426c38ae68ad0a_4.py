def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	if len(args)!= 1:
		raise ValueError('Invalid number of argument received.')
	if isinstance(args[0], str):
		return True
	return self.choices.choices().filter(name=args[0]).count() > 0


	# def validate_choices_kwargs(self):
	# 	"""
	# 	Check if args received are of the correct type and values are proper values.
	# 	"""
	# 	for name, value in self.choices.choices():
	# 		if inspect.is