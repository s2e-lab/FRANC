def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.
	
	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	parser = argparse.ArgumentParser(description='Parse an arguments from subparsers')
	parser.add_argument("--repository", required=True)
	parser.add_argument("subparsers")
	for arg in unparsed_arguments:
		parts = get_parser_argument_names(arg)
		args, found = parse_subparser(parts)
		parser.add_argument(str(arg), **args)
		if found:
			break
		else:
			parser.print_help()
	parser.print_help()