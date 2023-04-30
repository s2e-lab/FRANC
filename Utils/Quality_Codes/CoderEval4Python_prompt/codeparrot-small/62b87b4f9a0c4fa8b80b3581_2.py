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
		return self.minvalue
	
	if other < 0 or other > self.GetNbins():
		raise ValueError("Invalid bin range.")

	if recompute:
		# Calculate the histogram mean over the range of
		# N points, and compute the mean over each bin
		return self.computeMean() + other
	else:
		return self.computeMean(other)
