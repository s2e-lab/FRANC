def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	if not isinstance(args.args, dict):
		self.cli.error("Arguments for choices are not JSON. {0}".format(args))

	try:
		if not self.config.getboolean("general", "choice_is_multiple"):
			if args.args:
				self.cli.error("Only one value for argument \"choice_is_multiple\" is allowed per select.")
			return
	except (KeyError, ValueError):
		self.cli.error("Please check the available choices. {0}".format(args))