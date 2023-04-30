def base_config(user, etcd_host="localhost", etcd_port=2379):
	"""
	Creates a configuration with some simple parameters, which have a default value
	that can be set.
	
	Args:
	    user (str): the name of the user for the static authentication
	    etcd_host (str): the host for the database.
	    etcd_port (int): the port for the database.
	
	Returns:
	    dict: the created configuration.
	"""
	
	if not user or not type(user) == str:
		raise ConfigException("user must be a string, was %s" % type(user))

	# The root domain should always have all the user credentials.
	user = user.split(" ")[:2]

	return { 
	        "etcd_host": etcd_host,
	        "etcd_port": int(str(etcd_port)),
	        "user": { 
	        		"name": user[0], 
	        		"passwd": "