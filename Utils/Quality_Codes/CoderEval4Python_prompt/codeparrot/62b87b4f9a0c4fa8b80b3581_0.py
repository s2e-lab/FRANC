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
	

	if None == other:
		assert self.empty()
		return ScaleZero()
	
	rescale = 1.0 / other
	if not recompute:
		for hist in self.itervalues():
			hist.rescale = 1.
			
	ret = self.copy()
	if self.empty()!= other:
		self.update(other)
	for hist in self.itervalues():
		hist.rescale = rescale
	
	scale = rescale / other
	if scale!= 1.0:
		self.resize(scale)
	
	#