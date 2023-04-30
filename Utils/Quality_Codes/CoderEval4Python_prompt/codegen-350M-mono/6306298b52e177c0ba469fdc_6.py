def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	if len(node.childNodes)!= 0:
		raise NodeParseError("node %s has a non-empty child nodes" % node.nodeName)
	childNodes = dict([(name, childNode) for index, name, childNode in xget_namespaces(node)])
	return {}

