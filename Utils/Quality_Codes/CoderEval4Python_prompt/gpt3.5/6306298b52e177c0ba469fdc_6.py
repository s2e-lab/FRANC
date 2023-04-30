def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	
	This is only a shallow conversation - child nodes are not recursively processed.
	"""
		result_dict = {}
	
	for child_node in node:
		if child_node.tag in result_dict:
			# Convert existing value into a list.
			existing_val = result_dict[child_node.tag]
			if type(existing_val) != list:
				result_dict[child_node.tag] = [existing_val]
			result_dict[child_node.tag].append(child_node)
		else:
			result_dict[child_node.tag] = child_node
			
	return result_dict