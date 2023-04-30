def xml_children_as_dict(node):
    # Initialize an empty dictionary
    children_dict = {}
    
    # Loop through each child node of the current node
    for child in node:
        # Get the tag name of the child node
        tag_name = child.tag
        # Check if the tag name already exists as a key in the dictionary
        if tag_name in children_dict:
            # If the key already exists, append the child node to the existing value list
            children_dict[tag_name].append(child)
        else:
            # If the key does not exist, create a new key-value pair
            children_dict[tag_name] = [child]
    
    # Return the dictionary containing the child nodes keyed by tag name
    return children_dict