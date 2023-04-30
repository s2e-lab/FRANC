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
	
	if recompute:
		if other is None:
			return self
		return (1 / (1.0 - other)) * (1.0 + math.exp(-other))
	
	if self._canResize:
		return int((1.0 - self._rescaleFactor) * (1.0 - other))
	# XXX it might be better to use scaled, so we could get here with
	#  -1.0 and -1.0 - self - 1.0
	
	if self.has_scaled():
		return self.scaled()
	