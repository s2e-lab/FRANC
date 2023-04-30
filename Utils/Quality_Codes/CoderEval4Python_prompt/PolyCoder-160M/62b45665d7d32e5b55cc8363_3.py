def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	parser = argparse.ArgumentParser()
	parser.add_argument("name", required=True, help="specify a name to load")
	parser.parse_args(flags=args.flags)
	spec = parser.spec

	parser.add_argument("--target-path", required=False, help="specify the path to the data target_path")
	parser.add_argument("--num-sources", help="specify the number of unique source data")
	parser.add_argument("--max-sources", help="specify the maximum number of unique source data")