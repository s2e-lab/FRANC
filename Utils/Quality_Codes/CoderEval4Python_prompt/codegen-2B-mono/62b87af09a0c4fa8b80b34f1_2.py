def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	if len(self._bins) == 0:
		return
	
	ind = self._checkCoord(coord)
	if ind is None:
		return
	
	if len(self.y) == 0:
		self.weight *= weight
		
		# TODO: check
		l = 0
		r = len(self._bins) - 1
		while l < r:
			m = (l + r) // 2
			if self._bins[m].contain_coord(coord):
				return
			if