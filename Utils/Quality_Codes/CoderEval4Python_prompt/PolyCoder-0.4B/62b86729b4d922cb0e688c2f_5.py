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
	"""Get the current values from `self.get_values()`, or the dict from `self.get_server_values()`
	or `self.get_extra_values()`."""
	return self.get_values().get("etcd_host", self.get_values().get("username"))


