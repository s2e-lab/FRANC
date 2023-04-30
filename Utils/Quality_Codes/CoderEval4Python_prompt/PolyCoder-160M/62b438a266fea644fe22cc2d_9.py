def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.
	
	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	parser = argparse.ArgumentParser()
	args_for_subparsers = parser.add_argument_group(name=args.subparsers_name_short,
		action='\n\t',
		title="Parse args: " + args + " " + args_options)
	args_for_subparsers.add_argument(
		name=args.arg_short,
		action='_subparser',
		default=args.subparsers_name_short + '._subparser',
		help='Subparser name (name of parser '