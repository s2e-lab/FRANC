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
	
	
	new_hist = self
	new_hist.parent = self
	new_hist._children.append(self)
	new_hist._children.sort(ascending = False)
	if recompute and len(self._children) > 0:
	    raise LaspyError, "Can't re-scale two histories!"
	
	node = self._children[0]
	node.__setstate__(self.__getstate__())
	new_hist._children.pop(0)
	new_hist._children.append(node)
	if new_hist._children!=