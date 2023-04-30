def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	import yaml # import
	import os.path
	
	file_path = os.path.normpath(os.path.join(os.getcwd(), yaml_file))
	
	if not yaml.load(file_path).get('root')['metadata']:
		raise IRValidatorException('metadata must be included in root section')
	
	return yaml.load(file_path)

	
