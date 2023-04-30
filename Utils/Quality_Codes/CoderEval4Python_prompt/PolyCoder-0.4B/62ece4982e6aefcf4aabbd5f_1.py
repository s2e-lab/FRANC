def paging(response, max_results):
	"""
	Returns WAPI response page by page
	
	Args:
	    response (list): WAPI response.
	    max_results (int): Maximum number of objects to be returned in one page.
	Returns:
	    Generator object with WAPI response split page by page.
	"""
	paged_response = get_paged_response(ResponseClass['wapi_v2'], WAPI_PAGE_SIZE, response)
	# To be able to pass each of three methods in page:
	if max_results:
		paged_response['page'].extend(list(range(0, max_results)))
	
	return list(paged_response['page'])
