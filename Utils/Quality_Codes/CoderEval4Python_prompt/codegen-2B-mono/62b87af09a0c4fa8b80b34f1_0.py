def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	if coord < self.startdim:
		return
	elif coord > self.stopdim - 1:
		return
	elif coord > self.stopdim:
		# special care if this is in the 0-dim direction TODO
		# if we are in the 1-dim dimension and this is the end of our
		# histogram, just forget about this point and return
		if self._edges[0] == 0:
			return
		# else we need to compute the index we should be at *after* a
		# break
		i =