def paging(response, max_results):
	"""
	Returns WAPI response page by page
	
	Args:
	    response (list): WAPI response.
	    max_results (int): Maximum number of objects to be returned in one page.
	Returns:
	    Generator object with WAPI response split page by page.
	"""
	for page_obj in paging(response, max_results):
		yield page_obj
