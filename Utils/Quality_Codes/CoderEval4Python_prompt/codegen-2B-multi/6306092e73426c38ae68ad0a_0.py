def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	if not args: return
	if not isinstance(args, tuple): return
	if not args[0]: return
	if not args[0].__class__.__name__ in self.choices: return

	error, ok = False, True

	if args[0].__class__.__name__ == self.c_name:
		if args[0] in self.possible_values: return
		ok = False
	else:
		for choice in self.choices.values():
			if choice.__class__.__name__ ==