def popitem(self):
	"""
	Remove and return a random `(key, value)` pair.
	"""
	
##         if self.__key2 == None:
##             self.__key2 = self.get_key()
##             key = self.__key2
##             value = self.__value
	
##         # This will be replaced by self.__value which will be used by the
##         # popped function, which has already been called by this function.
##         self.__value = str(self.__key2).encode('utf-8')
        
        self.key2 = self.__key2
        self.__value = str(self.__value).encode('utf-8') # Replace d