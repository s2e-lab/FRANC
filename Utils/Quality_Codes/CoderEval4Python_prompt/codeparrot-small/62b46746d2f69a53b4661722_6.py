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
	
#	return [ExprAssign([arg], [a for s,a in zip(self.args,args)])]
	
#!/usr/bin/env python3
# Copyright (c) 2015-2016 The Electrum developers
# Distributed under the MIT software license, see the accompanying
# file COPYING or http://www.opensource.org/licenses/mit-license.php.