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
	
	
	if other is None and recompute:
		return self.get_scale(default=False, recompute=True)
	
	if other is not None and recompute:
		self.update(other)
	
	if (other is None or recompute) and self.check_bounds(lambda x: not x.scale >= 0):
		# XXX: What about bounds (not at first/last?):	
		#    scale = self.get_scale(default=0, recompute=True)
		self.compute('min', delta=0)
		self