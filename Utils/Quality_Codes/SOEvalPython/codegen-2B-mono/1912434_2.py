import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    attr_values = []
    xml = xml.replace('\\t',' ')
    root = ET.fromstring(xml)
    for attribute in root.iter(tag):
      if attribute.attrib.get(attr):
        attr_values.append(attribute.attrib['value'])
      else:# return if the tag does not have the attribute
        return attr_values

    return attr_values


