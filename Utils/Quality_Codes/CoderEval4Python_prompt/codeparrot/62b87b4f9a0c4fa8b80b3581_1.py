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
	
	
	if other:
		raise Exception('Cannot specify both a `other'` argument and a histogram')
	
	if not hasattr(self, '_a_init'):
		self._a_init = this_histogram_ctor();
	
	else:
		if not hasattr(other, '_a_init'):
			other._a_init = this_histogram_ctor();
	
	self._a_init.scale_up(self._a_init.get_scale_right(),
								scale_func=lambda v, s: s if s else 0,
								log=False,