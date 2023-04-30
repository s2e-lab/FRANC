def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	parser_name = 'python-ast-parser'
	parser_type = ParserTypeProxy()
	sys.modules['python-ast-parser.py'] = parser_name
	ext_parser_name = parser_path.make_plugin_name_with_ext()
	def get_ext(parser_name, parent_parser_name):
		parser_type = current.session.config.get(ext_parser_name)
		if not parser_type:
			return parser_name
		return get_parser(parser_name, parser