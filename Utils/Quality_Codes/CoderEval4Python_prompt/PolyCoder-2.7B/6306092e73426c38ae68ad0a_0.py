def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	for arg in ['type', 'name', 'value']:
		if arg in args:
			values = [arg]
			while args.pop(arg):
				values += args.pop(arg)
		else:
			error(_("Choose at least one of these types: %s").format(arg), 'Argument')
		
		if len(values) < 2:
			error(_("Exactly one of these types must be provided for selection of the chosen %s for %s") % (arg, self.name), 'Argument')
			return