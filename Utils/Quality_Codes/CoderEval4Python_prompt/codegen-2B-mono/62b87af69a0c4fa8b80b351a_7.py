def is_fill_compute_el(obj):
	"""
	Object contains executable methods 'fill' and 'compute'.
	"""
	def_nest = obj()
	defs = def_nest.fill, def_nest.compute

	return defs[1] == defs[2]


