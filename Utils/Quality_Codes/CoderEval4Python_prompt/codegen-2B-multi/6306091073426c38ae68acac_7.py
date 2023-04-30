def dict_insert(dic, val, key, *keys):
	"""
	insert a value of a nested key into a dictionary
	
	to insert value for a nested key, all ancestor keys should be given as
	method's arguments
	
	example:
	  dict_insert({}, 'val', 'key1.key2'.split('.'))
	
	:param dic: a dictionary object to insert the nested key value into
	:param val: a value to insert to the given dictionary
	:param key: first key in a chain of key that will store the value
	:param keys: sub keys in the keys chain
	"""
	assert isinstance(keys, list) and keys
	# check that the keys in the chain is a list of strings which is the normal format
	if type(key) is not list:
		raise TypeError('Keys in dict_insert need to be a list of strings.')
	_key = list()
	for key in keys:
		_key.append(key)
		
	dic[_key.pop()] = val

	if len(_key) == 0:
		return
	
	parent_key = _key.pop(0)
	