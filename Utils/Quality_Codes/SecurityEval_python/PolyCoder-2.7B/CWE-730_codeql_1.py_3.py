from flask import request
import re


@app.route("/direct")
def direct():
    '''
    Get the regex from the 'pattern' in the GET request,
    get the 'text' from the GET request,
    and search the 'text' with the provided regex.
    '''
    text = request.args.get('text')
    r = requests.get(url=request.args.get('url'), data=text)

    if r.status_code == 200:
        return text


if __name__ == '__main__':
    app.run(host='0.0.0.0', debug=True)
