def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	return Hists.Fill(self.h, coord, weight)  # hist object
	
	
	
