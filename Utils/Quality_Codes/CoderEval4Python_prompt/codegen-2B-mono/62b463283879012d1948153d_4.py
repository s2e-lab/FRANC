def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	return next(iter(match_by_xpath(node, pubdate_xpaths)), None)

