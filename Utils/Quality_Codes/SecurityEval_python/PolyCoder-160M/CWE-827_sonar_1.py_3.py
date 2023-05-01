from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    xmlroot = etree.XMLParser()
    xmlroot.parse(
                      ["from lxml.etree import c", "c.xml"]
                     )
    return xmlroot
