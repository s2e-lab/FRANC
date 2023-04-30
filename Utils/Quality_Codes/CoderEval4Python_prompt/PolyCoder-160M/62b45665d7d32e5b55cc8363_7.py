def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	parsers = []

	@classmethod
	def setup(cls, config):
		parser = cls.do_init(config)
		parser.add_subparsers(cls.__module__.split('.')[:-1])
		parsers += parser.parse_args(config, stripped=True)

		del config, stripped

		for parser in parsers:
			parser.add_argument('parser')
			parser.add_argument('filter_name', nargs='?', const=True,
									default=config.filter_config,