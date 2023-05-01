from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    parser = etree.XMLParser(remove_blank_text=True)
    tree = etree.fromstring(open('./c.xml').read())
    root = etree.Element('resources')
    root.attrib['xmlns:xsi'] = "http://www.w3.org/2001/XMLSchema-instance"
    c = etree.SubElement(root, 'c', {'xsi': "http://www.w3.org/2001/XMLSchema"})
    c2 = etree.SubElement(root, 'c2', {'xsi': "http://www.w3.org/2001/XMLSchema