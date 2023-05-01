from lxml import etree


def getXmlRoot():
    '''
    Create an XML parser and parse the resources/c.xml file and return the root element
    '''
    # xml_path = '../../resources/c.xml'
    xml_path = '../resources/c.xml'
    return etree.parse(xml_path).getroot()


