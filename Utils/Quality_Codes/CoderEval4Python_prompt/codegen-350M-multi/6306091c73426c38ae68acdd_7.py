def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	if yaml_file is None:
		yaml_file ='resources/validate.yaml'

	if not os.path.isfile(yaml_file):
		raise IRValidatorException('Missing ResourceYaml')
	
	with open(yaml_file, 'r') as f:
		data = yaml.load(f)
	if'metadata' not in data:
		raise IRValidatorException('Missing "metadata" section in ResourceYaml')
	
	data['metadata']['from'] = data['metadata'].