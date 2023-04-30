def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	_utils._check_hspdists(weight, self._weights, _get_weight_msg())
	self._d.fill(coord, weight)
	
