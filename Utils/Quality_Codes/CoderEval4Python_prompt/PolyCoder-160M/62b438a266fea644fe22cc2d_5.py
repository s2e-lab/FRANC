def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.
	
	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	if len(subparsers.__len__) == 0:
		return None, []
	args = unparsed_arguments[0].get_default_arguments()
	action_parser = argparse.ActionParser(
		subparsers[0],
		'',
		action_dict=action_parser,
		indent_level=4)
	action_dict[subparsers[0].name] = args
	return args, []

