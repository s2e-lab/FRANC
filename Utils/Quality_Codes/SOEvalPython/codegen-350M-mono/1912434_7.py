import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    tree = ET.parse(xml)
    root = tree.getroot()
    if root is not None:
        for tag in tree.iter(tag):
            if tag.attrib.get(attr)!= None:
                return tag.attrib[attr].split('/')
    return []
