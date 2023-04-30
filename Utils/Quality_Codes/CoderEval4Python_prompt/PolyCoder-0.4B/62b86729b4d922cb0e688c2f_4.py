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
	redis_backend = RedisCluster(use_ssl=False)
	conf = dict(host=etcd_host, port=etcd_port)
		
	# if your cluster uses only one user
	conf["users"] = 1
	#if __debug__:
	conf["users"]["user"] = user
	#  else
	#    conf["users"]["user"] = user
	# if __debug__:
	#     conf["users"]["user"] = user
		
	conf["user"] = user
		
	if redis_backend:
	#