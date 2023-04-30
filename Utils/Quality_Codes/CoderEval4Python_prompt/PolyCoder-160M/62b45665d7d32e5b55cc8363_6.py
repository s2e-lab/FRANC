def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	global PARSERS
	from..formatters.parsers import parsers

	return parsers
# end add_parser

