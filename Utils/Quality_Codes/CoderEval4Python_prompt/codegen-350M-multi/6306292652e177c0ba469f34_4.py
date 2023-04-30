def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	conn = httplib.HTTPConnection("content.google.com")
	conn.request("HEAD", url)
	result = conn.getresponse()
	content_type = result.getheader("Content-Type")
	if content_type is None:
		content_type = ""
	return content_type

