from flask import request
import re


@app.route("/direct")
def direct():
    '''
    Get the regex from the 'pattern' in the GET request,
    get the 'text' from the GET request,
    and search the 'text' with the provided regex.
    '''

    regex = request.args.get('regex', None)
    text = request.args.get('text', None)
    result = request.args.get('result', None)
    if regex is None:
        regex = re.compile(text)
    if result is None:
        text = re.sub(regex,'', text)
        result = regex.fullmatch(text)

    return redirect('/