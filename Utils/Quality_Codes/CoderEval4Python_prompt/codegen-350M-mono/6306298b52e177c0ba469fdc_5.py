def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	assert(node.startswith("<"))
	nodes = string.split(node, ">")
	children = {
		xml.etree.ElementTree.fromstring(tag, ignoretz=False): string.strip(text) for tag, text, _ in nodes
	}
	return children


