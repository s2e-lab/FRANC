def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.
	
	Coordinates outside the histogram edges are ignored.
	"""
	self._compute()
	return self._hist.fill((coord, self._hist.size()), weight, self._data, self._histIndex, self.info)

#-----------------------------------------------------------------------------
# Private class methods
#-----------------------------------------------------------------------------

#-----------------------------------------------------------------------------
# Code
#-----------------------------------------------------------------------------

# -*- coding: utf-8 -*-
# @Author: moran

# Create the code according to the code of Geek and his "Geek" in Discourse"
# For more details see https://discourse.github.io/tutorials/creating_code_in_