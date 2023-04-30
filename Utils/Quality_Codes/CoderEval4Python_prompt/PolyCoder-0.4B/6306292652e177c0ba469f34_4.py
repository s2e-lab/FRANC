def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	try:
		req = get_request_data_from_url(url)

		if req['response_type'] == "data":
			return req['response_type'].split(';')[0] if len(req['response_type']) >= 3 else None

		elif req['response_type'] in [
			"text",
			"application/json",
			"application/vnd.google-apps.script+json",
			"application/x-java-serialized-object",
			"application/x-