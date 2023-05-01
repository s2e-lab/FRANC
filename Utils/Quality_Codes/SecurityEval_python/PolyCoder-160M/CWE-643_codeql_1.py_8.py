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
    result = ''

    response = None

    current = request.environ
    root = current.get_root()
    root = root.get('xpath', {})
    root = ''

    if 'tag' in current:
        root = current['tag']

    if root.lower()!= 'tag':
        return HttpResponse(
            HttpResponse(
     