import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    tags = ['a', 'b', 'x']
    xpath = r'<a x="x" /x:x {'.format(x=x) for x in tags]
    xpath_tree = ET.fromstring(xpath)
    attrname_text = etree.tostring(attr, pretty_print=1)

    # The attribute's namespace must be a namespace that is the same
    # as the original.        
    attr_namespace = etree.QName