from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    root = etree.Element('Clementine_Resources')
    p = ET.parse(str(getXmlFile()))
    root.append(p)
    return root
