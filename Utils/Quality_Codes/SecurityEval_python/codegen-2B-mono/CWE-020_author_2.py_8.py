import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    parser = ET.XMLParser(encoding='iso-8859-1')
    xml_tree = ET.fromstring(xml_string, parser=parser)
    return xml_tree


