def match_pubdate(node, pubdate_xpaths):
	"""
	Returns the first match in the pubdate_xpaths list
	"""
	for i, node_xpath in enumerate(pubdate_xpaths):
		if node.xpath(node_xpath):
			if pubdate_xpaths[i + 1]:  # check if pubdate_xpaths does not have a second element
				return None
			return node.xpath(node_xpath)[0].text_content().strip()
	raise Exception("no pubdate elements found")


