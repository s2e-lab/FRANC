def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	validate_choices = args.get('validateChoices')
	
	if not validate_choices:
		self.fail('\'validateChoices\' argument not provided')
		
	elif validate_choices:
		validated_choices = []
		for choice in args['choices']:
			validated_choice = choice.value
			if not validated_choice in validators:
				self.fail('Choice %s is invalid' % validated_choice)
			
		self.log('validate_choices() validated arguments: %s' % validated_choices)
			
	return