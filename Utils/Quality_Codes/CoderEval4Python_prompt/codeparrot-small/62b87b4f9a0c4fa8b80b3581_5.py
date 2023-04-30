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
		# if all the values are scalars, then they aren't scaled
		if not isinstance(other, (float, long)):
			other = Scalable(other)

		if not isinstance(other, Scalable):
			raise TypeError("scale: scale must be of one of (float, long)")

		self._scale = other
		assert isinstance(other, Scalable)

		if self._scale == other._scale:
			return self

		if recompute:
			if self._scale == 0:
				l.warning("scale zero.")
				raise lena.Len