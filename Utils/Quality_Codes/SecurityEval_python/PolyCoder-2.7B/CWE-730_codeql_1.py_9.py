from flask import request
import re


@app.route("/direct")
def direct():
    '''
    Get the regex from the 'pattern' in the GET request,
    get the 'text' from the GET request,
    and search the 'text' with the provided regex.
    '''
    patt = request.args.split(" ", 1)
    regex = None
    search = patt.pop(-1)
    if any(char in "!" for char in query):
        regex = '?'
    if not any(char in "!" for char in query):
        regex = '\\'
    if any("'" in patt):
        regex = '\\'

    if any('`' in patt):