def paging(response, max_results):
	"""
	Returns WAPI response page by page
	
	Args:
	    response (list): WAPI response.
	    max_results (int): Maximum number of objects to be returned in one page.
	Returns:
	    Generator object with WAPI response split page by page.
	"""
	return_data = ''
	
	page = str(response[11])
	page_len = len(str(response[11][:-1]))
	
	def _get_page(response):
		page_num, page_skip, page_total = struct.unpack_from('<I', response.split(">I")[1:])
		num = num = _get_num(response)
		if num + page_skip > page_total:
			raise Exception("Error - invalid number of pages. Expected page_skip to be less than current page_