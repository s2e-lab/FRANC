from flask import request
import re


@app.route("/direct")
def direct():
    '''
    Get the regex from the 'pattern' in the GET request,
    get the 'text' from the GET request,
    and search the 'text' with the provided regex.
    '''
    text = ''
    urlpath = "regex"
    res = re.findall(r'.+', request.args['pattern'])
    for u in res:
        urlpath += u
        text += u
    res[urlpath] = urlpath
    for url in res:
        text += '/search'
    text += '/test'
    return text


@app.route("/regex