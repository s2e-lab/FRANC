from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    xmlParser = etree.XMLParser(remove_blank_text=True)

    with open('resources/c.xml', 'r') as c_xml_file:
        root = etree.parse(c_xml_file, xmlParser)

    assert isinstance(root, etree._ElementTree)
    return root


