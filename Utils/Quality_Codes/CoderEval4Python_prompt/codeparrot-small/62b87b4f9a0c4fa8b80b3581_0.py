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
			if recompute: return self
			else: return other
		if not isinstance(other, self.__class__) or recompute:
			raise HistogramsError, 'unsupported scale for'+ self.__class__.__name__
		if other < 0:
			raise HistogramsError, 'negative factor'
		return self**other
	
