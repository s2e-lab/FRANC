def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	parser = argparse.ArgumentParser()

	parser.add_argument("--outdir", type=str, default="/tmp/test.json", help="A file to write out.")
	parser.add_argument("--indir", type=str, default="/tmp/test.json", help="A file to read it out.")
	parser.add_argument("--include", "-o", type=str, default="./", help="A file from include or exclude")
	parser.add_argument("--exclude", "-d", type=str, default="", help="Exclude files")
	parser