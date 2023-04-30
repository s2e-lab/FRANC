def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	self.update(*coord)
	for j in range(-3,3):
		self.data[coord[0] + int(coord[1]), j+1] += weight * self.data[coord[0] + int(coord[1]) + j]

