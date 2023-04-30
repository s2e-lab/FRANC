def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	try:
		# Fetch the content type of the URL
		return urlfetch(url, allow_redirect=True, allow_fetch_content_type=False)
	except URLError as error:
		logger.warning("Unable to determine the content-type from {}: {}".format(error.url, error))

# -*- coding: utf-8 -*-