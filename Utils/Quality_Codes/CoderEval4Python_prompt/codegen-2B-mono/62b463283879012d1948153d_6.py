def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	for pubdate_xpath in pubdate_xpaths:
		pubdate = node.xpath(pubdate_xpath)
		if pubdate:
			return pubdate[0]
	return None


