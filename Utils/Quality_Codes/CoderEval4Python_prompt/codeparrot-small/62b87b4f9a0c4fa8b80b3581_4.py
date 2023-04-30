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
	
	
	if self.filling == 1:
		if other is None:
			return self.scale()
		elif other!= self:
			return self.__class__(other + numpy.arange(len(self.shape)) / 2. - self.__class__(2. - other / 2.))
		else: # only one entry was rescaled
			return self
		self.filling = 0
	
	elif self.filling == 2 and other is None:
		return self.offset()
	elif self.filling > 2 and other is None:
		return self