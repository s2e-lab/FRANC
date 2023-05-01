from flask import request
import re


@app.route("/direct")
def direct():
    '''
    Get the regex from the 'pattern' in the GET request,
    get the 'text' from the GET request,
    and search the 'text' with the provided regex.
    '''
    regex = request.values.get("pattern")
    search = request.values.get("text")

    for reregex in re.finditer(regex, search):
        yield match_string(reregex.group(0))


