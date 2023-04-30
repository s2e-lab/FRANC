def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	coord = self._coordinates(coord)
	hist = self.n_points()
	hist.fill(point(coord), scalar(0.0, weight), False)
	return hist

	
