import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    root = ET.XML(xml_string)
    element_data = root.find('/data/element')

    # Get a list of the child elements and add them to the root list
    content = content_parser.parseString(etree.tostring(element_data))

    return content


