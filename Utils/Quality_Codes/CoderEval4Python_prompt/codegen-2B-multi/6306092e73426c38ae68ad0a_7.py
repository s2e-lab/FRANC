def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	
	choices = self.choices
	values = tuple(args)
	
	if len(values)!= len(choices):
		if not self.optional_arguments:
			raise InvalidArguments("The " + str(len(choices)) + " parameters specified do not match any of the " + str(len(choices)) + " available choices.")
		else:
			if not self.optional_arguments[0]:
				raise InvalidArguments("The " + str(len(choices)) + " parameters specified do not match any of the