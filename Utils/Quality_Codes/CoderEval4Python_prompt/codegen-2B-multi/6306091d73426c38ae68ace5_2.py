def _include_groups(self, parser_dict):
	"""
	Resolves the include dict directive in the spec files.
	"""
	import os
	import re
	from xml.dom import minidom
	parser_dict_tree = parser_dict_tree = minidom.parseString(self._xml_spec_files)
	paths_parser_dict_tree = re.split('\W+', self._xml_spec_files)
	groups = parser_dict['__groups']
	group_parser_dicts = []
	for group_name in parser_dict['__group_names']:
		group_directive = re.sub(r'\s*/\s