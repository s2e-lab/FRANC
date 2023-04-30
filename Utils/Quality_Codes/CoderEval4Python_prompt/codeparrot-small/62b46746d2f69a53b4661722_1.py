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
		# Generate a new list of two expressions
		assert len(args) <= 3, "len_list must be a sequence which contains 3 items"
		# For each element.  For the element, we should add an absorption and set
		# them to the tuple at each point
		absorb_args = args + tuple(self.args)
		absorb_range = range(len(absorb_args), len(args)-1)
		absorb_range.append(len(args)-1)
		absorb = self.next