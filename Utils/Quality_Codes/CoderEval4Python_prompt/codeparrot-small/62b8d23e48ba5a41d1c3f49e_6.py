def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
		assert self.queue
		assert len(self.queue) == 1, 'Pick a random item from the queue.'
		key, value = self.queue.pop()
		assert key is not None
		assert value is not None
		return key, value

	item = popitem

