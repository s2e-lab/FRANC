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
	if isinstance(other, numpy.generic):
		other = float(other)
	if hasattr(other, 'x'):
		other = other.x
	if other is not None:
		assert abs(other-self.scale) < 1e-12, (
			"Scale must be an integer or float, not '%s'" % str(other))
		self.d += other - self.d
	elif recompute:
		self.d = self.get_density()
		scale = self.scale
	else:
		