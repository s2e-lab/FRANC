import xml.etree.ElementTree as ET

def xml_children_as_dict(node):
    """
    Turn the children of node <xml> into a dict, keyed by tag name.

    This is only a shallow conversation - child nodes are not recursively processed.
    """
    children_dict = {}
    for child in node:
        children_dict[child.tag] = child.text
    return children_dict