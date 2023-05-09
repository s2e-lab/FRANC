    from lxml import etree as parser, \
        etree.SubElement,  # etree.Node
    etree.SubElement(name='resources', 
        type=etree.SubElement(name=\"resources_attributes\",
          children=[root_node],
          type='attribute entry_title',
          is_subtag_element=True),
      