def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	if 0 < weight < 1000:
		from fundamentals import histogram, filter
		for i in range(0, len(self), 5):
			weight = 1

			if True:
				self[i:i+5] = [0] * 100000
				print "filling from", i, "to", i+5, "with", weight
		new_hist = histogram(self, weights=weight)
		if new_hist.data == []:
			weight = 1
		else:
			new