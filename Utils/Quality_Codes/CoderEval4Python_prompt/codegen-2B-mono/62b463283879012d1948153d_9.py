def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	return next((xmldate_to_date(x.text) for x in node.xpath(pubdate_xpaths)), None)

