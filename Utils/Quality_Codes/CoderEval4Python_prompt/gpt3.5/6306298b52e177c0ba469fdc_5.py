def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
		result = {}
	for child in node.children:
		if child.name not in result:
			result[child.name] = []
		result[child.name].append(child.text)
	return result