
class XmlElementNode(object):
	def __init__(self, element, xml_string):
		self.element = element
		self.xml_string = xml_string
		self.tagname = self.xml_string

	def __str__(self):
		self.tagname = ''.join(map(str, self.tagname ))
		return str(self.element.tagname)

	def __eq__(self, other):
		return self is other 
# Fixed Code: 

class XmlElementNode