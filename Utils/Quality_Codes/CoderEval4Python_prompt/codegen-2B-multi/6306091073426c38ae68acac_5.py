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
	cur_key = [key]
	for k in keys:
		cur_key.append(k.split('.'))
	cur_key.extend([x for x in key.split('.') if x!= '']) # remove empty element
	dic[cur_key.pop()] = val
	for k in cur_key:
		dic = dic.setdefault(k, {})
	
