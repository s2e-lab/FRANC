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
	
	
	if not self.IsScalar():
		return IECore.SmallerValue( self.getValue(), other )
	
	if other is not None and self.IsScalar():
		assert other.IsScalar()
	
	if recompute:
		self.resetScale( other = other )
		return self

	delta = self.getMinValue() - other.getValue()
	if delta == 0 or delta == 0:
		self[:] = self * other
		return
	else:
		return self * delta
	
		
