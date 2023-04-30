def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	hdr = self.hdict[coord.zslice]
	
	if coord.isDirection1():
		idx = coord.xslice
	else:
		idx = -1 if coord.isDirection2() else 0
	
	# set a histogram if possible
	if not self.has_histograms or (hdr is None and idx < 0):
		# create a histogram entry
		if self._new_histogram(hdr, coord, weight):
			# set current xslice to the idx of the new hist