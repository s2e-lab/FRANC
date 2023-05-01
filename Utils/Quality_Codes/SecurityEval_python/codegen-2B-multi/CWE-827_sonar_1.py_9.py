from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    tree = etree.fromstring('test_resources/c.xml')
    return tree.getroot()

