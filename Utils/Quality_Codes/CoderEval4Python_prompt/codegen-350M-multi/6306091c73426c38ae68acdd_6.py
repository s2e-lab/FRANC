def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	# Check whether YAML file was provided as keyword argument
	if yaml_file is not None:
		yaml = yaml_file
		data = open(yaml, "r").read()
		return cls.verify_yaml(data, yaml)
	
	# Otherwise return dictionary of loaded data
	return cls.verify_yaml(os.path.isfile(os.path.join(os.path.dirname(__file__), yaml_file)), yaml_file)