import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    try:
        root = ET.fromstring(xml)
    except:
        return ['No XML data']

    try:
        values = root[tag][attr]
    except:
        return ['No values']

    attrib_values = []
    for value in values:
        attrib_values[attr] = str(value)
    return attrib_values


