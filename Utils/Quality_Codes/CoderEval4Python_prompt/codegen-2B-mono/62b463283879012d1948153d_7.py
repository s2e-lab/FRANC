def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	for pubdate in pubdate_xpaths:
		node = node.xpath(pubdate)
		if node:
			return node[0]
	return None

