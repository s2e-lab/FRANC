def scale(self, other=None, recompute=False):
	"""
	Compute or set scale (integral of the histogram).
	
	If *other* is ``None``, return scale of this histogram.
	If its scale was not computed before,
	it is computed and stored for subsequent use
	(unless explicitly asked to *recompute*).
	Note that after changing (filling) the histogram
	one must explicitly recompute the scale
	if it was computed before.
	
	If a float *other* is provided, rescale self to *other*.
	
	Histograms with scale equal to zero can't be rescaled.
	:exc:`.LenaValueError` is raised if one tries to do that.
	"""
	
	if other is None:
		return self.__scale
	
	elif not recompute:
		# only if it was already computed before
		self.__scale = float(other)	# we expect a number
	
	self.__scale = other
	self._hist = self.__scale * self._hist.array
	
	# make sure that no bins below and beyond zero have been created
	# and that the histogram is properly scaled
	# this makes the next line meaningful
	# otherwise, the result lies between the bin edges
	