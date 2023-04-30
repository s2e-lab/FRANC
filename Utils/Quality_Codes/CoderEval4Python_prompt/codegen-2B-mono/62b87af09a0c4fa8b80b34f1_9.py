def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	ind = coord[0] * self.bins_per_dim + coord[1]
	if  ind < 0 or ind >= self.n_bins:
		return

	w = weight

	if self.n_bins == 1:
		# special care for histograms with 1 bin
		if w == 1:
			self.hist[0] += w
		else:
			assert w == 0
			self.hist[0] += -1
	else:
		# general case
		val = 0
		if w == 0:
