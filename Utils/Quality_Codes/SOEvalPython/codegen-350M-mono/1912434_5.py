import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    def _get_tags() -> list:
        _tags = [x.tag for x in ET.fromstring(xml).iter()]
        return list(_tags)
    
    # Set of tags to check: tag, attr_name
    tag_attr_set = {attr, xml}
    # Get list of values
    if tag is None:
        # Value can be an attribute.
        tag_attr_vals = {key for key,value in tag_attr_set.items() if value}
    else:
        # Value can