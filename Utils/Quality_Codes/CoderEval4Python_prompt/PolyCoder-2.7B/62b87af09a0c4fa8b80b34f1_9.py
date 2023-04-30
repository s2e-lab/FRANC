def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	if not self._valid:
		raise RuntimeError('Histogram is not valid!')
	
	xhist = (self.data[coord[0]])		# x values for each line
	yhist = (self.data[coord[1]])		# y values for each line
	if min(xhist) < min(yhist):
		return
	if max(xhist) > max(yhist):
		# if max value is not greater than min value, we might need to fill left values (min and max)
		# to avoid filling