from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    root = ET.XML("<root />")
    with open(ROOT+"/c.xml", "r") as f:
        root.parse(f)
    return root


