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
		expr = set([(a, 0) for a in args])
		while arg_is_sub(expr, 'AB'):
			expr.remove((A, A + 'b'))
			arg_is_sub(expr, 'AB')
		return expr

	def _absorb(self, n):
		start = []
		stop = n-1
		while end > 0:
			a, b = 0, n
			if (end-a) == 1:
				break
			if a > stop:
				a, b = b, a