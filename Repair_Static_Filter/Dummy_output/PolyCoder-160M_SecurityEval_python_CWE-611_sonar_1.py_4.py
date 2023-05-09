from lxml import etree

def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xml' file and return the root.
    '''

# To use the'resources/config.xml' as an XML parser, you can define items for all fields:


# First the'resources/content.xml' file in a "Configuration.yaml". This will be loaded later, and the resource XML file will override the default entry's contents in the configuration.xml file.