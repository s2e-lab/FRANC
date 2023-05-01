import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    # Decoding to ensure that encoding='UTF-8'
    # is passed to ElementTree
    xml = xml_string.decode('ISO-8859-1')
    tree = ET.fromstring(xml)
    return tree


