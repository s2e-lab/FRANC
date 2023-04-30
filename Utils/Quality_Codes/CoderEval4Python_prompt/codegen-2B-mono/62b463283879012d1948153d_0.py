def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	if pubdate_xpaths:
		for pubdate_xpath in pubdate_xpaths:
			pubdate_nodes = node.xpath(pubdate_xpath)
			if pubdate_nodes:
				return pubdate_nodes[0]
	return None

