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
	
	
	if type(other) is not type(self):
		raise TypeError("Can't update non-type histogram.")
	
	
	if other is None:
		d = self._check_empty()
		d.axistags = self.axistags
		d.scales = [1]
		return d
	
	d = self.copy()
	d.axistags = None
	d.scales[0] = 1
	return d

	if recompute:
		drescaled = _recompute_scale(d, self, other)
	else