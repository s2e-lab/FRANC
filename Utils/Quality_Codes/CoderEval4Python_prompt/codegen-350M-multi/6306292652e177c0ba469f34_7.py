def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	res = http.urlopen(url)

	if ctid not in res.headers:
		returnNone
	return res.read()
