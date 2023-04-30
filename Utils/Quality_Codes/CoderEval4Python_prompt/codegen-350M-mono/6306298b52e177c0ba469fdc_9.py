def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	
	rv = { }
	if node.tagName not in rv:
		rv[node.tagName] = []
	for child in list(node):
		if child.tagName not in rv:
			rv[child.tagName] = []
		rv[child.tagName].append(child)
	return rv

