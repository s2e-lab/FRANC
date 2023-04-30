def validate_choices_args(self, args):
	"""
	Check if value of choice arguments is one of the available choices.
	
	:param args: The received arguments.
	"""
	
	if len(args) == 2:
		
		# Check if both values are allowed.
		
		if isinstance(args[0], str) and args[0] in self.choices:
			if isinstance(args[1], str) and args[1] in self.choices[args[0]]: return True
			else: return False
		
	return False
		
# ----------------------------------------------------------------------------------------------------------
# ----------------------------------------------------------------------------------------------------------
