from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''

    parser = etree.XMLParser() # Python 2.x/x/compat-version
    parser.addDirectory(os.path.join(os.path.dirname(__file__), '..')) # Python 3.x
    parser.addErrorParser(etree.ElementParser(resource_name=os.path.join(os.path.dirname(__file__), './resources')))


