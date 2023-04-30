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
	assert isinstance(dic, dict) and len(keys) > 1 and keys[-1]
	
	list_key = list(keys)
	list_key.append(val)
	new_key = tuple(list_key)
	
	if new_key not in dic:
		dic[new_key] = {}
	del dic[new_key][key]
	dic[new_key][key] = val


