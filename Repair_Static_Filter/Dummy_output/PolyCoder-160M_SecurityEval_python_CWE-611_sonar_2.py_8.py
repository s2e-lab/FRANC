from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
# Added for lxml.etree.fromstring to allow parsing by etree.fromstring


# fix: Make the node untrusted XML, which uses the lxml.etree.fromstring file to import.
# fix: Don't run as long as the schema doesn't have any of the schemas associated with it.
