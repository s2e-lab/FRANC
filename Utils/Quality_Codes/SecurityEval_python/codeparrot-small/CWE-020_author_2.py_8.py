import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''
    nodes_by_attr_val = dict()
    elem = ET.fromstring(xml_string.encode('utf-8'))
    if len(elem) < 1:
        return None  # No <root> element
    parent = elem[0]
    for node in parent:
        tag_list = []
        attr_iter = list(node.getchildren())
        for child in attr_iter:
            if child.tag == "{http://www.w3.org/1999/xlink}b":
                attr_val = child.text
            else:
                attr_val = child.text
           