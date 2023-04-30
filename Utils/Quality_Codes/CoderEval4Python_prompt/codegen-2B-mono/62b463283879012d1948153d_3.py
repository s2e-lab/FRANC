def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	match = None
	if len(pubdate_xpaths) > 0:
		pubdate_xpath = pubdate_xpaths[0]
		try:
			pubdate_node = node.xpath(pubdate_xpath)
			if len(pubdate_node) > 0:
				match = node.xpath(pubdate_xpath)[0]
		except:
			pass
	return match

