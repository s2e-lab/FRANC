def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	
	try:
		return args['choice_selected'] in _choices.keys()
	except KeyError:
		assert False, 'You must provide an `choices` list.' 
	
	
  
	
	
	
	
