def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	pubdate = node.find(xpaths['pubdate'])
	if pubdate:
		matches = match_list(pubdate.xpath(xpaths['pubdate_xpaths']))
		if matches:
			return matches[0]
		else:
			return None


