def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	assert coord.upper() in ('A', 'C', 'G', 'T')
	self._coord[coord.upper()] = weight
	del self._coord[coord.upper()]
	#for coord in self._stats:
	#	self._stats[coord] = weight

