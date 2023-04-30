def next_version(version):
	"""
	Next version identifier following existing pattern.
	
	Must deal with both zero-prefixed and non-zero prefixed versions.
	"""
	
    next = 1
    
    while not version.startswith("0") and next <= len(version) and next_is_valid_version(version[:6]):
        next += 1
        
    if version!= "0":
        raise Exception("Unsupported version prefix: %s" % version)
        
    return version, next

#
#
# Still to be changed? Note that the following methods have to be changed:
#
#   __len__()
#   __setitem__()
#   __getitem__()
#   __delitem__()
#   __iter__()
#   __contains__()
#
#