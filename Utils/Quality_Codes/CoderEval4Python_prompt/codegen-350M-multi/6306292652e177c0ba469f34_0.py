def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	url = url.replace('http', 'file')
	head = requests.head(url)
	content_type = head.headers.get('Content-Type')
	if content_type is None:
		content_type = 'application/octet-stream'
	return content_type


