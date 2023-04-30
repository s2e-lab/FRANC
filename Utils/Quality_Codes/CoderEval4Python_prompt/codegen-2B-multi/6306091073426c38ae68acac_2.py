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
	for tmp_key in keys:
		k = key + tmp_key
		dic = dic[k] if k in dic else {}
	dic[key] = val
	return dic

#--------------------------------------------------------------------
# get dictionary key-value pair
#--------------------------------------------------------------------
