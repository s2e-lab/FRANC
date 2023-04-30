def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	return self.base_name + u'; '.join(r for r in parser_dict[u'include'])

	#def include(self, parser_dict):
	#	try:
	#		if parser_dict.has_unknown_directive(u'include'): return self.base_name + u';'.join(r for r in parser_dict[u'include'])
	#	except KeyError:
	#		raise InvalidIncludeError(self, parser_dict)

	#def include_group(self, parser_dict):
	#