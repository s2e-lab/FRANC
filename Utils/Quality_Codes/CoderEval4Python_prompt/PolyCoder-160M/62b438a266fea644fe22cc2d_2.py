def parse_subparser_arguments(unparsed_arguments, subparsers):
	"""
	Given a sequence of arguments and a dict from subparser name to argparse.ArgumentParser
	instance, give each requested action's subparser a shot at parsing all arguments. This allows
	common arguments like "--repository" to be shared across multiple subparsers.
	
	Return the result as a tuple of (a dict mapping from subparser name to a parsed namespace of
	arguments, a list of remaining arguments not claimed by any subparser).
	"""
	# TODO: Consider making additional parameters optional and then also optional arguments.
	# For a simple example of a simple scenario where a parser would like to parse as one
	# argument, but you can't parse any argument like: ["--repository <name>", "--repository..."]
	
	# A default dictionary from parser
	parsed_arguments = defaultdict(dict)
	parser_name_args = {
		"repository": {
			"arg": "repository",  # optional
			},
		}
	for subparser_name, a_list in subparsers