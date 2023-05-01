from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    xmlfile = os.path.join(os.path.dirname(os.path.abspath(__file__)), "resources/c.xml")
    print etree.iterparse(xmlfile)
    root = etree.iterparse(xmlfile)
    return root

 