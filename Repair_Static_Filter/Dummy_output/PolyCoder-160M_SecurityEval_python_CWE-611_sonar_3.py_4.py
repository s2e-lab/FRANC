
# In code below, with an initial namespace. (Note: It doesn't affect the namespace of XML resources, it contains, but it just contains)
# In code below, with a default namespace (e.g., it is  http://www.apache.org/resources/xsds/)

# Create the XML parser object and return an etree object
# This does NOT modify the input XML file or the XSLT object, but rather just
# the one created by the etree parser factory.
    n_xml_obj, n_xmlns_xml_obj = etree