def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	if url.startswith("https://api.github.com/"):
		url = url[7:]
	elif not url.startswith("http://"):
		url = "http://" + url

	parsed = urllib.parse.urlparse(url)
	parsed = urllib.parse.urlparse(url)
	parsed = urllib.parse.urlparse(parsed)
	return parsed.scheme

	raise Exception("fetch_content_type is not yet implemented.")


