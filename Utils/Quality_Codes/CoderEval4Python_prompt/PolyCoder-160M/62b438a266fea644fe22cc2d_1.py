def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.
	
	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	# We take a list of passed subparsers of arguments from both subparsers, and all subparsers added as options,
	# which can be overridden by using options for subparsers:
	#
	# args = {}
	#
	# for parsed_subparser, args in unparsed_arguments:
	# 	if parsed_subparser in parsed_subparsers and (args[parsed_subparser] == "add" or args[parsed_subparser] == "build" or "run"):
	# 	cmd = args.get("cmd", "")
	# 