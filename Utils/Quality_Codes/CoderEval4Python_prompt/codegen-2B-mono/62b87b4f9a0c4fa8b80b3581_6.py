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
		if self._cache[0] == 0 or self._cache[1]:
			raise LenaValueError()
		if self._scale is None:
			return self._hist / self._cumulative * self._sum_scale
		return self._scale
	if recompute:
		self._set_scale(other)
	else:
		self._scale = other
	#
	assert other in (0, None) and (recompute or self._cache[2])
		
