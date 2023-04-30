def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	r = requests.head(url)
	r.raise_for_status()
	return r.headers['content-type']


