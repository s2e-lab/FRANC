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
	
	a = []
	
	
	# Add one argument:
	if isinstance(args[0], str):
	arg = args[0]
	else:
	arg = args[0]
	
	
	self = []
		
	
	for t in args[1:]:
		if isinstance(t, Expression):
			arglist = t.args
			break
		elif isinstance(t, ExpressionList):
			arglist = t.args[0]
		else:
			arglist = arglist.args
		
		if arglist.__class__ == Variable:
			a