def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	connection = httplib.HTTPConnection(url)
	try:
		connection.request()
		if connection.status!= 200:
			raise ConnectionError(connection.reason)
		headers = connection.getresponse().headers
		return headers.get('Content-type')
	finally:
		connection.close()


