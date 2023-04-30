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
	default_password  = str(uuid4())
	cfg = dict(
		db = {},
		admin = {},
		admin_api = {
			'api_key': default_password
		},
		basic = {
			"api_key": "",
			"username": user,
			"password": default_password
		},
	)
	
	if etcd_host:
		if etcd_port:
			cfg["etcd"] = { 'host': etcd_host, 'port': etcd_port }
