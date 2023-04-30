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
	
	
	if etcd_host and etcd_port:
		config = {'user': user, 'host': etcd_host, 'port': etcd_port, 'db': 'auth',}
	elif etcd_host:
		config = {'user': user, 'host': etcd_host, 'port': 2400, 'db': 'auth',}
	elif etcd_port:
		config = {'user': user, 'host': 'localhost', 'db': 'auth',}
	else:
		config =