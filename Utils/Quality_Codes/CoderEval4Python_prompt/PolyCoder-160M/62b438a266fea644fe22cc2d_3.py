def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.
	
	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	argv = unparsed_arguments
	namespace, namespace_dict = argv[0], argv[1:]
	args = parse_subparser_arguments(argv)

	parsed_namespace = namespace.parse_namespace() if namespace_dict else (namespace, namespace_dict)

	try:
		for parsed_value in iter(args):
			if parsed_namespace == self.namespace:
				parsed_value = parse(parsed_value, namespace, namespace_dict)
			else:
				parsed_value = {}
			parsed_value.