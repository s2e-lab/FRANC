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
	
	
	# If we're not provided, generate a new one.
	if other is None:
		raise LenaValueError(self.__class__.__name__)
	# Get some defaults
	if recompute:
		a = self.__class__.__name__
		if not hasattr(self, "__dict__"):
			self.__init__(self.__class__.__name__,a+"_%d" % a)
		else:
			for key in self.__dict__:
				dval = self.__dict__[key]
				oval = 0
				try:
					oval = a