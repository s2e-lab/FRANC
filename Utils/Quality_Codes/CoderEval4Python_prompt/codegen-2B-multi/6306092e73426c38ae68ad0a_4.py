def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	
	# Check if the values is a legal choice
	selected_choice = ''
	for arg, possible_choice in self.validation_choices:
		selected_choice = arg
		if arg == args:
			return
	if selected_choice is '':
		return 'You must either specify "any" or any of the available {0}'.format(self.validation_choices)
	
	# Check if the values is an instance of the desired one
	if isinstance(self.validation_choices[0], dict):
		for