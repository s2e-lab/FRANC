def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	if not args["choice_id"]:
		if args["choice_data"]:
			args["choice"] = args["choice_data"]
		else:
			raise ValueError("Choice argument requires a value.")
	if not args["choice"]:
		raise ValueError("Null Choice argument received.")
