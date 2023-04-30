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
		try:
			return self.scale(other, recompute=recompute)
			return self.scale(other, recompute=recompute)
		except ValueError, e:
			raise lena.LenaValueError(e)
	
	def __iadd__(self, other):
		"""
		Adds two histogram instances.
		
		:attr:`numbins` must equal the lengths of all bins.
		:attr:`scale` may be set to a scalar in the first call.
		:attr:`start` is not the first bin before the one that was
		removed.
	