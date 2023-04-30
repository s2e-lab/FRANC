import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    try:
        return [e.text for e in ET.fromstring(xml)]
    except ET.XMLParseError:
        tag_value = tag[tag.index(':')+1:]
    else:
        return None

