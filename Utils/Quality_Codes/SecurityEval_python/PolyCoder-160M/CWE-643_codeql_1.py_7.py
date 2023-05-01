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

    xml = request.META['REQUEST_METHOD']
    try:
        xml = xml.split(',')
        # remove the empty line. the first 1 is needed to strip quotes 
        xml = xml[0].strip("\r\n").strip()
    except ValueError:
        # the first 1 is that is because the method is not a query
        try:
        