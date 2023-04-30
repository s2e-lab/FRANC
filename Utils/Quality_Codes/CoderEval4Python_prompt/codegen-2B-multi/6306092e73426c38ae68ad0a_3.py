def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	valid, msg = "true", None
	for arg in args:
		valid_choices = filter(lambda choice: choice[0] == arg, self.choices)
		if valid_choices:
			choice = valid_choices[0]
			if choice[0] == arg:
				if isinstance(choice[1], (str, unicode)):
					msg = choice[1]
				else:
                    # XXX: check for valid input
                    pass
		else:
			valid, msg = "false", "Error: Invalid choice {