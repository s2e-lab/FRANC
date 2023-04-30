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
	
	
	if other == None:
		if not hasattr(self, 'bins'):
			other = None
		else:
			other = self.bins
	   
	if type(other) is list:
		if len(other) == 0:
			return self
		self.set_nbins(other, recompute or self.recompute)
		return self
	else:
		other = [other] * len(self)
		if recompute or self.recompute:
			other = [self] * len(other)
		return self.__class__(