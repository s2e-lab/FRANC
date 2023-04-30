import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    attr_values = []
    tree = ET.fromstring(xml)
    for node in tree.findall(tag):
        # Only get elements that have attr as a value
        if node.get(attr) is not None:
            attr_values.append(node.get(attr).text.lower())
    return attr_values

