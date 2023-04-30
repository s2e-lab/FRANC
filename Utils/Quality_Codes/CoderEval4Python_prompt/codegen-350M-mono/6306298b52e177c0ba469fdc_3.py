def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	res = {}
	for child in node.getChildren():
		res[child.tagName()] = _xml_children_as_dict(child)
	return res

