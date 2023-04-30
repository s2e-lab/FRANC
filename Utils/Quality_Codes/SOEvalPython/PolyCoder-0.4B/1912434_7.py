import xml.etree.ElementTree as ET

def get_attr_values_by_tag(xml: str, tag: str, attr: str) -> list:
    '''
    Get a list of attribute values for a given tag in an XML string.

    Example:
    get_attr_values_by_tag('<a><b x="1"/><b x="2"/><b x="3"/></a>', 'b', 'x') -> ['1', '2', '3']
    '''
    from gensim.api import (
        AttrList,
        AttrDict,
        AttrListOrNone,
    )
    doc = xml.split("</")
    # make sure we have one element
    if len(doc) > 1:
        return []
    root = xml.find("./").getroot() # pylint: disable=import-outside-toplevel
    if root:
