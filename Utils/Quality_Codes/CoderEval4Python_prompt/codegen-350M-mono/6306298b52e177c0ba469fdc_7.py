def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	child_dict = {}
	for child in node:
		assert isinstance(child, Element)
		tag = child.tag
		child_dict[tag] = xml_children_as_dict(child)
	return child_dict
	
# --------------------------------------------------------------------------
