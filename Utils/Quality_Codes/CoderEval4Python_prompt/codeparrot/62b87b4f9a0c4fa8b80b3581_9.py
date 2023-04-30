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
		return self.scale(other)
	except ValueError:
		pass
		
	# TODO: Should we handle multiple scales?
	# Ideally I'd like to deal with the other scale argument
# and the other scale was computed on a scalar.
	# I think we could probably get it from numpy.float64(1.0).
	# Just try and guess if that's in the case of a 0-d array
	# and scale it appropriately.
	# Try and use the case of a scalar
	if not np.isscalar(other