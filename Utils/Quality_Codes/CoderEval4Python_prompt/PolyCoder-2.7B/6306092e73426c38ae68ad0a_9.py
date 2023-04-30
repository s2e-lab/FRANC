def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	for i, param_group in enumerate(args.groups, start=1):
		group_names, choices = param_group.groups()
		valid_choices = [c.lower() for c in choices]
		if "choice_string" in args.choices:
			valid_choices.remove("choice_string")
		if "choice_choices" in args.choices:
			for group_str in args.choices["choice_choices"]:
				group_index = int(group_str.startswith("("))
				if group_