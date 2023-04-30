def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	url = url.lower().strip()
	if url.startswith("http:"):
		fetch_to_head = True
	else:
		fetch_to_head = False

	return fetch_to_head or url_has_perm(url, "head", fetch_to_head=fetch_to_head)


