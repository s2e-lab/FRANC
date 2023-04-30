def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	out = {}
	for child in node.childNodes:
		if child.nodeType == Node.TEXT_NODE:
			out[child.nodeName] = child.data
		elif child.nodeType == Node.ELEMENT_NODE:
			if (child.nodeName not in out):
				out[child.nodeName] = {}
			out = out[child.nodeName]
		elif child.nodeType == Node.DOCUMENT_NODE:
			# Ignore Document and comment nodes in a document
			if child.