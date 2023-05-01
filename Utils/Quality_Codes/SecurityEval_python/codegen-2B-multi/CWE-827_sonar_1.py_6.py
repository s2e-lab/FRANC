from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    r = resources.get_resource('../Xml.xml').content
    # Create an xml parser:
    parser = etree.XMLParser(encoding='utf8')
    xmlRoot = etree.fromstring(r, parser=parser)
    return xmlRoot

