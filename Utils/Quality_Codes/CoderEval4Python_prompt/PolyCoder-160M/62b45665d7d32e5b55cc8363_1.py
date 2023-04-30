def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	parser = argparse.ArgumentParser(
		description = 'Print the specified content(s)'
	)
	parser.add_argument(
		"--config-file",
		type = T("config file"),
		help = "Path to the configuration file",
		default=None,
		metavar=config,
		nargs='+',
		default=None,
	)
	parser.add_argument("--max-batch-size",
		type = T("max amount of memory"),
		help = "The maximum number