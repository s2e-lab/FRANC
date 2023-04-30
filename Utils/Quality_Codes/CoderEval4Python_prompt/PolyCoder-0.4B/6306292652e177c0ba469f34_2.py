def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	content_type = None

	req = Request(url)
	try:
		result = responder.response_from_string(req)
	except:
		if sys.version_info >= (3,) and 'code' not in str(err.http_status):  # pylint: disable=wrong-import-position
			raise RuntimeError('No code received.')
	else:
		content_type = result.content_type
	return content_type


