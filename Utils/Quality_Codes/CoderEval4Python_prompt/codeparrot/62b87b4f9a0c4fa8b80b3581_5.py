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
	     
		if not self.dtype == other.dtype:
			raise ValueError("Cannot rescale histograms of different types")
		
		other_hist = type(self)(other)
		if not other_hist.dtype == self.dtype:
			raise ValueError("Cannot rescale histograms of different types")
		
		if recompute and other_hist is None:
			raise ValueError("Cannot rescale histograms of different data")
				
		# We're already computing histograms of values, so calculate the 
		# absolute values, and multiply by the appropriate scale
		scale_hist = int