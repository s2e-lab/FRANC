import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    tree = ET.fromstring(xml_string)
    elem = etree.Element('root')
    xml_root = ET.SubElement(elem, 'datablock')
    root_node = tree.getroot()
    if root_node.tag!= root_root.tag:
        raise ValueError('incorrect root element')
    return root_node

