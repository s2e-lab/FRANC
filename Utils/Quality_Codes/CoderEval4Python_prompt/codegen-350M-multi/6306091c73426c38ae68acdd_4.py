def validate_from_file(cls, yaml_file=None):
	"""
	Loads & validates that a YAML file has all required fields
	
	:param yaml_file: Path to YAML file
	:raise IRValidatorException: when mandatory data is missing in file
	:return: Dictionary with data loaded from a YAML file
	"""
	if yaml_file is None:
		logger.info("Loading yaml file")
		yaml_file = os.path.join(os.path.dirname(__file__), 'datasets', 'training.yaml')
	with open(yaml_file) as f:
		config = yaml.safe_load(f)
	yaml_file_dir = os.path.dirname('.')
	yaml_file_base = os.path.basename(yaml_file)
	if yaml_file_