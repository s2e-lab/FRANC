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
	if type(other) == type(self):
		if len(self) == 0:
			raise LenaValueError("scale can't be computed from empty histogram")
		if recompute:
			self._cache[SCALE]=0
		scale = self._cache[SCALE] = (self._cache.get(SCALE, 0) + other._cache[SCALE]) / 2
		if not recompute and scale == 0:
			raise LenaValueError("scale can't be zero")
	else:
		if other:
			scale = other
		el