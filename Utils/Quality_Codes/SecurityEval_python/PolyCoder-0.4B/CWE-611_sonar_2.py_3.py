from lxml import etree


def get_root():
    '''
    Create an XML parser, parse the 'resources/config.xsd' file, and return an XMLSchema.
    '''
    return etree.fromstring(
        '''<?xml version="1.0" encoding="UTF-8"?>
        <configuration version="3" xmlns="urn:oasis:names:tc:xacml:3.0">
            <defaultState name="default-state" type="default-state"
                       stateName="default-state" />
   