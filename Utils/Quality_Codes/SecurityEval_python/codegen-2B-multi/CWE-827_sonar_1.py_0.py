from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    parser = etree.XMLParser(namespaces=NS_MEM)
    root = etree.parse(RESOURCES_FILE, parser=parser)
    return root.getroot()


