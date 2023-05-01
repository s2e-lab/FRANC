from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    root = etree.Element("root")
    root.set("xmlns", "http://www.unrealengine.com/schemas/unrealengine/1.0/unrealengine.1.0")
    root.set("xmlns:xmllang", "http://unrealengine.com/")
    root.add_tail("#EXT:xmllang/unrealengine.1.0")
    return root.getroot()


