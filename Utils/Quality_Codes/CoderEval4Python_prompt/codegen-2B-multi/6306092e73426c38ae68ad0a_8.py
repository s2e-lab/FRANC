def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	if not isinstance(args, dict): return
	if "value" not in args: return
	if not args.get('type') == self.type: return
	if "choices" not in args: return
	try:
		choice = args["choices"]
	except KeyError:
		return
		
	if not isinstance(choice, list): return
	try:
		value = args["value"]
	except KeyError:
		return
	if not isinstance(value, str): return
	for opt in choice:
		if