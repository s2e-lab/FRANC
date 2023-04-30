import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    xml = ET.fromstring(xml)
    results = []
    for child in xml.iterchildren():
        tag_value, attr_value = get_child_values_by_tag(child, tag, attr)
        results.append({
            "tag": tag,
            "value": tag_value,
            "value_value