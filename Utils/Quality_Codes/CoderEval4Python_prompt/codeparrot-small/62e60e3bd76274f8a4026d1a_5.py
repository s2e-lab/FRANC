def from_raw_values(cls, values):
	"""
	Create a Bookmarks object from a list of raw bookmark string values.
	
	You should not need to use this method unless you want to deserialize
	bookmarks.
	
	:param values: ASCII string values (raw bookmarks)
	:type values: Iterable[str]
	"""
	
	
	# Make a mutable list to store bookmarks in.
	values = copy.deepcopy(values)
	for value in values:
		if isinstance(value, bytes):
			value = touni(value)
		assert isinstance(value, bytes)

	return Bookmarks(values)
# -*- coding: utf-8 -*-
# Generated by Django 1.9.6 on 2016-02-28 20:04