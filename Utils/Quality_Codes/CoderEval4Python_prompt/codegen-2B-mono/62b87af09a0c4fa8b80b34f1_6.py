def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	if coord is None:
		# fill all coordinate
		for x in sorted(self.keys()):
			self.fill_by_coord(x, weight)
	else:
		# fill a point of the histogram by *coord*
		if coord in sorted(self.keys()):
			self.fill_by_coord(coord, weight)
		else:
			print(f'ERROR: cannot fill in coordinates {coord} because it is outside the histogram\'s bounds')

	return None


