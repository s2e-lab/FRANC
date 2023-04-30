def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	index = self._find_bin_for_coord(max(0, min(coord, self.x_length - 1)))
	self._bin_sums[index] += weight