def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	
	
	if version == "" and version_comment.match(version_number):
		version_number = version_comment.sub('<version>', version_number, 1, 1).lower()
		version_number = version_number[:version_number.rindex("v")] + 1
	
	if not version_number.isdigit():
		raise error.ParseError(_("Incorrect version number '%s'.") % version_number)
	
	return int(version_number) % 1000#!/usr/bin/python2.4
#
# Copyright 2011 Google Inc. All Rights Reserved.
#
# Licensed