def validate_arg_deprecation(self, cli_args, answer_file_args):
	"""
	Validates and prints the deprecated arguments.
	
	:param cli_args: the dict of arguments from cli
	:param answer_file_args:  the dict of arguments from files
	"""
	if 'default' not in cli_args:
		self.fail('The --default flag is present when reading the cli')
		
	if 'test' not in cli_args:
		self.fail('The --test flag is present when reading the cli')
		
	if 'tests' not in cli_args:
		self.fail('The --tests flag is present when reading the cli')
		
	if 'coverage' not in cli_args:
		self.fail('The --coverage flag is present when reading the cli')
			
	if 'coverage: