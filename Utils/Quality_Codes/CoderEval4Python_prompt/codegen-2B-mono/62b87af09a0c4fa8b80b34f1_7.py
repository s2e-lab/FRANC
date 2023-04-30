def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	if weight < 0:
		raise NoOverflowError("Attempted to add weight < 0")
		
	try:
		self.heap.push((weight, coord))
	except StackFullError:
		raise OverflowError("Attempted to add weight > %s"% (self.MAX_WEIGHT,'))
		
	weight, coord = self.heap.pop()
	while weight <= self.MAX_WEIGHT:
		if self.size < self.MAX_SIZE:
			self.size += 1
			self.cachedWeight =