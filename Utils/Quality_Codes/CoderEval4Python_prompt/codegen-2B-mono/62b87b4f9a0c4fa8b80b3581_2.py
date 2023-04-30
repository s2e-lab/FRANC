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
	if not recompute and self.__class__.scale.fset:
		self.scale = self.__class__.scale.fget(self)
	else:
		self.scale = (self + 0.0).integ().sqrt()
		self.__class__.scale.fset(self, self.scale)
	return self
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
