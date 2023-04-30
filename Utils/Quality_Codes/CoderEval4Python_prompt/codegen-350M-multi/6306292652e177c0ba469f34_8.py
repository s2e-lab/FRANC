def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	data = urllib.request.urlopen(url).read()
	data = data.decode('utf-8')
	match_head = re.search('^head: (.*)$', data, re.M)
	return match_head.group(1).lower().strip() if match_head else None


