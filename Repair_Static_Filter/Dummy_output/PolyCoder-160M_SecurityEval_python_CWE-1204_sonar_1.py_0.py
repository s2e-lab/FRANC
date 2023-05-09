  def init(s):
      return (type(s), s)
          
      # Added for Python 3
       
  def getKeysBytes(data):
      r = []
      for key in list(data.keys()):
          if key == 'A':
              r.append(getEncryptionKey(data[key], key))
  