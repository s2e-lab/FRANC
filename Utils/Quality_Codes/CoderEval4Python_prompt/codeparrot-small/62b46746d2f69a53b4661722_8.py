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
	
        res = []
        for arg in args:
#			new_expr = arg.absorb()
	                old_expr = A._eval(arg)
#			if new_expr > old_expr:
		#				res.append(new_expr)
                res.append(arg)
            
        return res
