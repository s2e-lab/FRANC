def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
	children = node._children
	out = {}
	for t, child in children:
		if isinstance(child, list):
			tag = 'child%s' % len(children)
		else:
			tag = child
		out[tag] = xml_children_as_dict(child)
	return out
		
	
	
# -----------------------------------------------------------------------------------
# <class 'daej_model'>
# <class 'daej_node'>
#
# class <class 'daej_node'>
# class <class 'dae