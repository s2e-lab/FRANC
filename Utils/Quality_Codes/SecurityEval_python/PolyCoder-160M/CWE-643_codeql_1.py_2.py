from lxml import etree
from io import StringIO

from django.http import HttpResponse


def xpath_query(request):
    '''
    Get the `xpath` value from the GET request,
    get the 'xml' value from the GET request,
    construct and parse the xml payload,
    return the result of the XPath query "/tag[@id={}]" format from the parsed xml
    '''
    xml = etree.tostring(request.__getattribute__(2), encoding='utf-8')
    xml = ''.join(xml.split('<!doctype' in doc.documentElement))
    return StringIO(xml)
