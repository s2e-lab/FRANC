from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    tree = etree.fromstring('''{
        "resources": { "file-1.xsd": {
          "from-file-1": {
          "@type": "ResourceType",
          "name": "directory-resource-1",
          'description': "Directory Resource"
          },
          "from