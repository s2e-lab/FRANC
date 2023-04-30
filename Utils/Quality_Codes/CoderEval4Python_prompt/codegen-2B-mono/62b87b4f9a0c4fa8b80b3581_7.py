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
		if self._needs_scale == 0 and self._force_recompute == 0:
			return self._scale
	else:
		if other is self:
			# self = old_self; recompute old_self = None and return
			self._needs_scale = 0
			self.__scale = other.scale()
			self._force_recompute = 0
			return self._scale
		if any(abs(self[i])*abs(other) > self.n()/2.0 for i in range(