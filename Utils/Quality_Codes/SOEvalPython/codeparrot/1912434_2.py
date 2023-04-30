import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    if tag not in xml: return []
    result = []
    items = xml.split(tag)
    for group in items:
        data_dict = {}
        index = 0
        for dataElem in group:
            if index == 0:
                dataElem = ET.Element(tag)
                dataElem.text = dataElem.text.strip()
                if dataElem.tag == tag and dataElem.text!= None:
                    data_dict[index] = dataElem.text
            else:
                if dataElem.tag == tag and dataElem.text == None and dataElem.attrib == None: