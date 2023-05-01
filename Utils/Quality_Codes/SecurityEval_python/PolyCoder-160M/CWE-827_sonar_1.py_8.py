from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    xml = etree.fromstring(lxml.etree.tostring(lxml.etree.XSD.parse(fixturesPath), xmlFormat="xml"))
    return xml


