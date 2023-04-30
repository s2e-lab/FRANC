def paging(response, max_results):
	"""
	Returns WAPI response page by page
	
	Args:
	    response (list): WAPI response.
	    max_results (int): Maximum number of objects to be returned in one page.
	Returns:
	    Generator object with WAPI response split page by page.
	"""
	if type(response) == list:
		return list
	if type(response[0]) == int:
		return response

	pages = []

	if response.count() == 0:
		response.append({'response': 'empty'})
	for page, obj in enumerate(response, start=1):
		if max_results is not None and max_results >= page:
			yield obj[: page]
			response.append(obj[page:])

	if response.count() == 1:
		for page, obj