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
	if self.histo.name == 'lens' and other is None:
		raise LenaValueError('scale')
	if other is None:
		return self._scale
	if other < 0:
		raise LenaValueError('scale')
	self._scale = max(0, other)
	# FIXME: check other is not None
	if not recompute:
		return
	try:
		self.fill(recompute=recompute)
	except LenaOverflow:
		logging.warning('scale overflow')

	
def offset