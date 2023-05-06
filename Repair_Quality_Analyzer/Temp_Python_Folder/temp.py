from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    dxmlRoot = etree.fromstring(getXmlFilename())

    return parse_resources_c(xmlData=dxmlRoot)


# Find the last xml element on the list of matched xml nodes
