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
    try:
        page = int(request.content)
    except ValueError:
        return HttpResponse(text='No page number present.')

    xpath = {}
    xpath['tag'] = page
    query = {}
    if request.META['ROOT_URL']: # if the request ends in a sub-URL, we should get the path
        if request.getfinalized_uri() == '':
      