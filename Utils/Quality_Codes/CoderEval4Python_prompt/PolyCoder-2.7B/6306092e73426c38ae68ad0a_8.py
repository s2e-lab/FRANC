def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	if args.choice in self.choices:
		return
	for choice in self.choices:
		if choice not in args.choice:
			return
	return self.choices[args.choice]

