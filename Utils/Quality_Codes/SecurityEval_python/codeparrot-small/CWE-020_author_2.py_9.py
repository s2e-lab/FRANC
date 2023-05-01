import xml.etree.ElementTree as ET


def parse_xml(xml_string):
    '''
    Parse xml_string and return the root element of the XML document
    '''

    root = ET.parse(xml_string)
    return root
# -*- coding: utf-8 -*-
# Part of Odoo. See LICENSE file for full copyright and licensing details.