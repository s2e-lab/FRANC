import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''

    if attr == '':
        return []

    nodes = xml.split()
    if tag in nodes[0]:
        return [node.split('=') for node in nodes]

    n = node.split('=')
    if len(n) == 2:
        return [n[0], n[1]]

    raise ValueError('Unknown attribute. Please update XML string with this.')


