def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	# Read YAML file
	if yaml_file is None: raise IRValidatorException("YAML file required")
	try: 
		data = load_yaml(yaml_file)
	except RuntimeError: 
		logger.error("YAML file was corrupted or is not present")

	return data


