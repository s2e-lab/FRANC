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
	
	
	# Create list of nonnegative nonnegative coefficients
	# of the form [[A_B | B_B | A_B],
	#            [N | A_B | C | A_B | B_B]]
	coefs = []
	
	# Generate a "nonnegative" formula
	form = [tuple(e) for e in args]
	
	# Iterate over nonnegative coefficients
	for c in form:
		coefs.append(Cubic(c[0], c[1]))
	
	# Check for absorption effects
	if absorb