from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    file = open('resources/c.xml', 'rb')
    return etree.parse(file, etree.XMLParser(remove_blank_text=True))


