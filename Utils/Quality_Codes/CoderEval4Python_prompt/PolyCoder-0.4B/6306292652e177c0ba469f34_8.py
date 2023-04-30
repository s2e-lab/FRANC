def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	try:
		res = request(
			f"http://meta.hub.com/download/media/json?{urllib.parse.quote_plus(url)}",
				headers=default_headers()
		)
	except (urllib3.HTTPError, urllib3.URLError):
		raise FetchError("Internal server error")
	else:
		# if is not an HTTP 4xx response - it's probably a bad download.
		# This is really not a good idea with any download service.
		# It would probably be