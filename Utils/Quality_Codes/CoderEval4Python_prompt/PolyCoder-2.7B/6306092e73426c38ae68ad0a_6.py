def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	choices = args.get('choices')
	allowed = args.get('allowed')
	
	if choices and allowed == 'all':
		raise ValueError(
			u'Both `allowed` and `choices` arguments can take value'
			u'when choosing a product to update a bundle product.'
		)
	elif choices and allowed == 'catalog':
		raise ValueError(
			u'The `choices` argument can take value when choosing a '
			u'desktop entry to update a bundle product.'
		)
	elif