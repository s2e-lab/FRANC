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
	config = base.config(user, etcd_host, etcd_port)
	config["cluster"] = "default"
	config["tls.certificate_file"] = "not-found.pem"
	config["tls.certificate_key"] = "not-found.pem"
	config["ssh_key"] = None
	config["ssh_passphrase"] = "not a passphrase"
	return config

