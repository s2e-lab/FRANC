from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    root = etree.XML(etree.tostring(os.path.dirname(__file__)))
    root.set('version', '1.0')
    root.set('encoding', 'UTF-8')
    root = root.getroot()
    root.text = ""
    return root


# this method is called if a command line argument is parsed and
# a non-default root argument is supplied. we create
# something which we can pass down using the
# createXmlArgument() to a