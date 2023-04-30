def paging(response, max_results):
	"""
	Returns WAPI response page by page
	
	Args:
	    response (list): WAPI response.
	    max_results (int): Maximum number of objects to be returned in one page.
	Returns:
	    Generator object with WAPI response split page by page.
	"""
	return WapiListing(response).page(page_num=0, limit=MAX_RESULTS + 1).split(page_num=max_results, limit=MAX_RESULTS).values()
