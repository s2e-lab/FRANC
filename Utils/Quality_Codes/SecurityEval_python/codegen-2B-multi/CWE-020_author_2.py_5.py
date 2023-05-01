import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''

    parser = ET.XMLParser(target=None)

    return ET.fromstring(xml_string, parser=parser)


