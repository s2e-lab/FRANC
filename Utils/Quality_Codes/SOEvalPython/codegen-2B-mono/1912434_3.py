import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    if attr == '_id':
        # handle case where we want the ids of some items
        # this is needed when there is single node with multiple items
        return getattr(ET.fromstring(xml).find(tag), attr)
    elif tag!= '*':
        return getattr(ET.fromstring(xml).find(tag), attr)
    else:
        return list(ET.fromstring(xml).iter(tag))

