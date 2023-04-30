def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	for i in range(len(self._bins)-1):
		self._hist._add(self._hist._bin_edges[-1][0], self._bins[i])

# -----------------------------------------------------------------------------
#                                                      Example program
# -----------------------------------------------------------------------------
