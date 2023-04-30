def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	assert coord >= 0 and coord < len(self._edges)
	self._counts[self._edges[coord]:self._edges[coord+1]] += weight

	return (None, self._counts)

