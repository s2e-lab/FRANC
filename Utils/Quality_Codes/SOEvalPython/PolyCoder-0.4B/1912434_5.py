import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    r = ET.fromstring("<x a=\"1\"/>", xml)
    r.tag = tag
    return [value.xml_value for value in r.findall(attr) if value.xml_value.tag!= tag]

