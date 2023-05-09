from lxml import etree


def transform_xml():
    '''
    Create a XML parser, parse the 'resources/config.xsl' file,
    and return an XSLT object.
    '''

# Create the XSLT object from the XML file and run each (required)