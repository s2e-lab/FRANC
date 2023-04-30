def make_parsers():
	"""
	Build a top-level parser and its subparsers and return them as a tuple.
	"""
	parser_factory = functools.partial(ParserBase,
		make_main_params(), 'Make Parser')

	parsers = {}

	for arg in arg_list:
		parser_factory('parse_value', arg, parsers[arg])

	return parsers

#ifndef __CONFIG_H
#define __CONFIG_H
