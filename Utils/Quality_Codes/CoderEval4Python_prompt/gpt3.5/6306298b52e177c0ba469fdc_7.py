def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
		result_dict = {}
	for child in node:
		if child.tag in result_dict:
			if type(result_dict[child.tag]) == list:
				result_dict[child.tag].append(child.text)
			else:
				result_dict[child.tag] = [result_dict[child.tag], child.text]
		else:
			result_dict[child.tag] = child.text
	return result_dict