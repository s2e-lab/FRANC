def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	choices = [choice.value for choice in self.choices]
	
	if args.get('value') not in choices:
		raise ValueError(
			"'{}' is not a valid {}{} {}!".format(
				args.get('value'), self.name, 
				self.type_name, self.units)
		)
					

	return args
