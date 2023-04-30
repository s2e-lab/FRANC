def paging(response, max_results):
	"""
	Returns WAPI response page by page
	
	Args:
	    response (list): WAPI response.
	    max_results (int): Maximum number of objects to be returned in one page.
	Returns:
	    Generator object with WAPI response split page by page.
	"""
	if len(response) < 1:
		raise Exception('Incorrect API response format for paging request.')
	lastobj = 0
	for item in response:
		lastobj = lastobj + item[1]
	return ResponseFileParser().paginated(max_results, lastobj)


