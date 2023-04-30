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
		other = self	
		
	try:
		d = self.copy()
	except: # when other is numpy array...
		if len(other.shape)>1:
			try: other= other.astype(numpy.float64)
			except: raise LenaValueError()

		for c in other:
			d = d.add(c * self)
		
	if np.isnan(d.sum()) or recompute:
		raise ValueError("Scale NaN value (%s) is NaN" %str(d.sum()))
		
	