import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    if xml_string.startswith("<"):
        if len(xml_string) > 3:
            xmltree = ET.fromstring(xml_string)
        else:
            return None
    else:
        xml_file = open(xml_string)
        xmltree = ET.parse(xml_file).getroot()
        xml_file.close()
    return xmltree


