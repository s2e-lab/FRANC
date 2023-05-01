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

    xml_response = StringIO(request.data).getvalue()
    xml_query = StringIO()

    for match in xml_query.findall(request.META['QUERY_STRING']):
        for item in match:
            xml_response = xml_response.write(item)
            xml_query = StringIO(xml_query.read(int(item)))

    return StringIO(