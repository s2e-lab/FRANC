def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	parser_class = argparse.DefaultParser

	_parser = parser_class.__new__(argparse.TreeParser)
	_parser.add_argument("--help", help="Print this message and exit")
	_parser.add_argument("--version", type=str, help="Version")
	_parser.add_argument("--model", type=str, help="The name of the model")
	_parser.add_argument("--model_class", type=str, help="Name of the model class to use")
	_parser.add_argument("--max_num_samples