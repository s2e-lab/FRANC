def absorb(self, args):
	"""
	Given an `args` sequence of expressions, return a new list of expression
	applying absorption and negative absorption.
	
	See https://en.wikipedia.org/wiki/Absorption_law
	
	Absorption::
	
	    A & (A | B) = A, A | (A & B) = A
	
	Negative absorption::
	
	    A & (~A | B) = A & B, A | (~A & B) = A | B
	"""
		return [self.applyabsorption(arg) for arg in args]
	
	@property
	def expression(self):
		"""
		The expression with the maximum absorption applied to the
		expression.
		"""
		return self.maxabsorption(self.absorb(self.args))
		
	@property
	def absorb(self):
		"""
		The expression with the absorption applied to the A_B.
		"""
		return self.absorb(self.args)
	
	@property
	def absor