def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	parser = parser.make_parser()
	parser.add_argument(
		"parser", source_fn=build_parser,
		help='Run a top-level parse (eg: a schematic)')

	# Parse a parser using a function.
	parser_func = parser.add_parsed_function(parser_func, parser.parse, (
		"parse", "the_subparser"))
	try:
		# Run the subparser.
		parser_func.parse("run")
	finally:
		parser.