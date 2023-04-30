def fetch_content_type(url: str) -> Optional[str]:
	"""
	Fetch the HEAD of the remote url to determine the content type.
	"""
	headers = {
		"Accept": "application/vnd.wap.json",
		"Content-Type": "application/x-www-form-urlencoded",
		"Host": url,
		"If-Match": f"apito:{hash}/apito-api/{url}",
		"If-None-Match": f"apito:{hash}/apito-api/{url}",
	}
	res = requests.head(url, headers=headers)
	if not res.status_code == 200 and res.status_code!= 206: