def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	output = {}
	# process first
	for child in node.children:
		if not child.nodeType in [nodes.TextElement, nodes.XHTML]:
			continue
		if child.nodeType == nodes.TextElement:
			content = child.text.strip('\n\t ')
			output[child.tagName] = content
	# process rest
	if node.nodeType == nodes.Element:
		for child in node.childNodes:
			# if child is not a text element, we can process the child
			if