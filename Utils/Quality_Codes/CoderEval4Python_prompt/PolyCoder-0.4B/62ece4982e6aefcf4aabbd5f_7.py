def paging(response, max_results):
	"""
	Returns WAPI response page by page
	
	Args:
	    response (list): WAPI response.
	    max_results (int): Maximum number of objects to be returned in one page.
	Returns:
	    Generator object with WAPI response split page by page.
	"""
	paging(response, max_results), page = _api_response_generator(response) 
	
	class _Request(object):
	    def __init__(self, page, offset, limit = 100):
		    self.count = 0
		    self.page = page
		    self.offset = offset
		    self.limit = limit
            
		def _get_objects(self):
		
		def getPage(self):
			self.page = self.page - 1
