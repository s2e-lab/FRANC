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

    # Construct the XML payload to the request
    xml = StringIO.StringIO(StringIO.BytesIO(request.text))

    # Parse the xml, return the result
    root_element = xml.find(xpath_query)
    if root_element == None or root_element.get("xpath", "") == "":
        return HttpResponse([])

    root = root_element.get("xpath", "")
    if 'tag' not in root:
 