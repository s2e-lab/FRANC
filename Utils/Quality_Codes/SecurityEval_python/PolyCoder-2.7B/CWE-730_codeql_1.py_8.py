from flask import request
import re


@app.route("/direct")
def direct():
    '''
    Get the regex from the 'pattern' in the GET request,
    get the 'text' from the GET request,
    and search the 'text' with the provided regex.
    '''
    pattern = request.args.get('pattern')
    text = request.args.get('text')
    regex = re.compile(pattern)
    return_val = regex.search(text)

    return render_template('index.html', return_val=return_val, title=title)
