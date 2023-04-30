def paging(response, max_results):
	"""
	Returns WAPI response page by page
	
	Args:
	    response (list): WAPI response.
	    max_results (int): Maximum number of objects to be returned in one page.
	Returns:
	    Generator object with WAPI response split page by page.
	"""
	url = '{}/paging.json'.format(API_ROOT)
	response = requests.get(url)
	json_data = response.json()
	max_results = int(json_data.get('maxResults', 20))
	return response.split(max_results, page=1)
