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
	   
	b=set()
	for expr in args:
		expr=expr/float(expr.p)	
		b=b|(expr.p-1)*100.
		b=b-100.
		c=2*expr.p+1
		if c < 0 or c > 100:
			raise ValueError ("Invalid number of absorptions")
			
	return b
	
	"""
	Take a list of expressions, and returns a new list of
	absorptions applied.
	
	See https://en.wikipedia.org/wiki/