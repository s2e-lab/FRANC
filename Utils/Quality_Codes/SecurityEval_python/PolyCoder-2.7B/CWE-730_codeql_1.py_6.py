from flask import request
import re


@app.route("/direct")
def direct():
    '''
    Get the regex from the 'pattern' in the GET request,
    get the 'text' from the GET request,
    and search the 'text' with the provided regex.
    '''
    regex = request.args.get("pattern")
    text = request.args.get("text")
    try:
        regex = re.compile(regex, re.VERBOSE)
    except TypeError:
        regex = re.compile(str(regex), re.VERBOSE)
    try:
        text = re.compile(text, re.VERBOSE).search(regex).group()
    except TypeError:
     