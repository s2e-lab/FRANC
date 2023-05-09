
    try:
        # Create a'resources/resources.properties' property
        root_node.find_one('resources/properties')
    except:
        # No matching entries found in the tree
        pass

    # Create an'resources/properties' property
    root_node.find_one('resources/properties/1')
    xml.find('property', 'value', value=2)
  