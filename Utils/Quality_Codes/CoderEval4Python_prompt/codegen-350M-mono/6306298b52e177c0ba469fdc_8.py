def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	children = node.getElementsByTagName("xml")
	if len(children)==0: return None

	return {
		attrname: xml_children_as_dict(node.childNodes[0].getElementsByTagName(attrname)[0]) if len(node.getElementsByTagName(attrname))>0 else _no_xml_attr_found(node.nodeName)
		for attrname in ["tag", "text"]}


