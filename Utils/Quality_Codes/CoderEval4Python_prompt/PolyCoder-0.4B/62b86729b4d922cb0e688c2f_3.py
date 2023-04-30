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
	base = base_config.__dict__
	_base_args = ["user", "etcd_host", "etcd_port"]
	_default_args = ["adminkey_secret"]
	
	if etcd_host == 'localhost':
		_hosts = _base_args
	else:
		_hosts = (_base_args + [_etcd_host] + list(_base_args[1:]))
	_hosts.extend([_etcd_host] + base_config["etcd_host"])
	_hosts.extend(_default_args)
	
	base