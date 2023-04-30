import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''

    root = ET.fromstring(xml)
    
    # find the children of the root
    children = root.findall(tag)

    if children is None:
        return []

    attr_values = []

    for child in children:
        # get the attribute value of the tag
        attr_values.append(child.get(attr))

    return attr_values


