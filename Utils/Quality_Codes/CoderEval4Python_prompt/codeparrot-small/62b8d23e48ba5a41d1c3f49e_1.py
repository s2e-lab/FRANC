def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	
	# Find the best entry that can pop
	if self.value() == []:
		return None

	# Get the next block
	key = None
	for i in range(self.count):
		if self.data[i][0] > i:
			break
		key = self.data[i][1]
		for j in range(i + 1, len(self.data)):
			self.data[i].remove(key)
	
	# If the item is still in the range
	if key not in self.state:
		self