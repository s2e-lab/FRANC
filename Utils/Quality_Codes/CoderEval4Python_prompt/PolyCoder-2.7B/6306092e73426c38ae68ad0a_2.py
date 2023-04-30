def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	if args.get("choices") and check_int(args["choices"]) and len(args["choices"]) > 0:
		self.options.choices = args["choices"]  # type: List[str]
	
	return self
