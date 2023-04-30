def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	if (coord<0 or coord>=self.N or self.data[self.edges[0][0]]==None): return
	if (coord<self.N): return self.copy().fill(coord, weight)
	else: return self.copy().fill(coord)

