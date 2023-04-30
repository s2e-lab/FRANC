import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    return_list = []

    if tag.startswith('{'):
        return_list.append(get_attr_value(xml, tag)
                           for tag in ET.fromstring(tag.encode()))
    else:
        xml_elements = ET.fromstring(tag)
        root = ET.fromstring(xml_elements.tag)
        for el in root:
            return_list.append(el)
    return return_list

