from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    root = etree.ElementTree(file=c.xml_file)
    root.set('version', '2.4')
    xsi: Element, SubElement, ElementTree
    dtd = etree.XMLSchema(root)
    return dtd.getroot()


