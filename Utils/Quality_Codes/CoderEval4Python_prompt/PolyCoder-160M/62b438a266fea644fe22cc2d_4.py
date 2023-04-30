def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.
	
	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	for name, argv in list(unparsed_arguments.items()):
		a_subparser = argv.get("subparser")
		if a_subparser is not None:
			argv_dict = unparsed_arguments[name]
			nargs = argv_dict.get("nargs")
			if nargs:
				if isinstance(nargs, dict):
					a_subparser["nargs"] = nargs
				elif isinstance(nargs, (tuple, list)):
					a_subparser["nargs"] = len(argv_dict)
				