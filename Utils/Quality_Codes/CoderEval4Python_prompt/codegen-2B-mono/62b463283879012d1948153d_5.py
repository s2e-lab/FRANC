def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	if node and node.xpath_strs:
		matches = (x for x in pubdate_xpaths if node.xpath_strs[0] == x)
		return next(matches)
	else:
		return None
