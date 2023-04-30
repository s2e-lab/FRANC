def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.
	
	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	parse_namespace_string = unparsed_arguments.get("namespace", "")
	parse_subparser_kwargs = unparsed_arguments.get("parse_subparser_kwargs", "")
	args = self.parse_arguments(parse_namespace_string, subparsers)

	# Parse the arguments
	namespace_name = args["namespace"]
	repo_name = args.get("repository")
	parsed_namespace = self.parse_namespace(namespace_name, repo_name)
	parsed_namespace = self.parse_subparser(parsed_namespace, subparsers)