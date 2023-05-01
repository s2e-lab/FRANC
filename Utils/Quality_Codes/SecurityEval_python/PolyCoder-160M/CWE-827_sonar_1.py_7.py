from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    root = ( etree.SubElement( None, 0 ) )
    root.attrib["name"] = "Resources"
    return root  # Add the root element


