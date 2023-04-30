import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    m = ET.ElementFindAll(xml, ET.Attr, namespaces={'a':'http://www.w3.org/2002/07/element'})

    for att in m:
        if att.tag == tag:
            val =''.join([attr_val.text for att_val in att.getiterator()]).strip()

    return[val]

