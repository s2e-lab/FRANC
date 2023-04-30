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
	try:
		parent = key[0]
		while parent!= '/':
			parent = key[:key.find(parent)]
			key = parent.replace(parent.replace('/', '.'), '')
	except ValueError:
		parent = ''

	for key in keys:
		if parent!= '':
			key = key.replace(parent, '')
		if key == '':
			dic.update({key: val})
		elif key not in dic:
			dic[key] = dict()
		dict_