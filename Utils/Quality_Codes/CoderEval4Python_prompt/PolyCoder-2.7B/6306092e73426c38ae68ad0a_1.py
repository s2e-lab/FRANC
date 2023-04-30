def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	invalid_args = []
	
	error = ("The selection option you entered in this dialog box "
			 "has to be one of: %s" % self.choices)
	for value in args:
		if value not in self.choices:
			if self.options.type in self.type_choices:
				error += ("You have to specify an option you "
					 "can choose in the right position "
					 "you specified: %s" % value)
		invalid_args.append(error)
	if invalid_args:
	