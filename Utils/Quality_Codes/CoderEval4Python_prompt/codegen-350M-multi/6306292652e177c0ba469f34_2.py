def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	headers = {}
	for key, value in environ.getall("HTTP_" + url, {}).items():
		if key.startswith("HTTP_"):
			headers[key[4:].replace("HTTP_", "", 1)] = value
	return headers.get("content-type").split(";")[0].strip()

