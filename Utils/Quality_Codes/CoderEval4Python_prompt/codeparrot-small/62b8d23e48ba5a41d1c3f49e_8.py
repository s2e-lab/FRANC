def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
		key, value = self.key, self.value
		if key == self.selection:
			return value
		else:
			raise Tkinter.TclError("key not in selection")

