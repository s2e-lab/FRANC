import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    doc = ET.fromstring(xml_string)
    print(ET.tostring(doc))
    return doc


