def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	req = urllib.request.Request(url)
	with urllib.request.urlopen(req) as response:
		head = response.headers
		if head.get("Content-Type", '').lower() == 'text/html':
			return response.info().get_content_type()
	return None

## Utility methods
## The above will do nothing if the url to download to points to a directory or
## url ending in.html
