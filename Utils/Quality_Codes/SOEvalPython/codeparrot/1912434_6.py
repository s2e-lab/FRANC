import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    if tag in ('*', '_str'):
        return [item for item in ET.parse(xml)]
    else:
        return [attr for item in ET.parse(xml).findall(tag) if item.tag == tag][0].text


