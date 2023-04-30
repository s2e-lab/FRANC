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
		result = []
		for i in range(0, len(args)):
			result.append(args[(i + 1) % len(args)])
			if not result or i == len(args) - 1: break
		
		return result
	
	def multiply(a,b):
		"""Multiplies a by b based on its args.
		Note that unlike ``self.absorb()``, return (A + B).
		
		Raises an `ValueError` exception if `a` and `b` are not equal.

		Notes
		-----
		Returns a `B` with