def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.
	
	Args:
	    before: Split file before these delimiters.
	    after: Split file after these delimiters.
	"""
	self._cut_chars = before + after

	# Determine cutting points
	index = 0
	start_index = len(self._data)
	while index <= len(self._data) + len(self._cut_chars):
		if index < len(self._data) and self._data[index: index + len(self._cut_chars)] == self._cut_chars:

			self._cut_index = index
			break

		index += 1

	# Update cutting points dictionary
	self._cutting_points[self._name]