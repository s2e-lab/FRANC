import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    tree = ET.fromstring(xml_string)
    root = tree.getroot()
    return root


