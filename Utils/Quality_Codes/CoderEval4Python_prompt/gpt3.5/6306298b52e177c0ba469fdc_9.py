import xml.etree.ElementTree as ET

def xml_children_as_dict(node):
    """
    Turn the children of node <xml> into a dict, keyed by tag name.

    This is only a shallow conversation - child nodes are not recursively processed.
    """
    # Create an empty dictionary to store the tag names and corresponding values
    dict_node = {}
    
    # Loop through all the children of the input node
    for child in node:
        # Store the tag name and value of the child node in the dictionary
        dict_node[child.tag] = child.text
        
    # Return the resulting dictionary
    return dict_node