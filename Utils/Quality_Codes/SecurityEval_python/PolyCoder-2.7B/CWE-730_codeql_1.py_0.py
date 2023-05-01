from flask import request
import re


@app.route("/direct")
def direct():
    '''
    Get the regex from the 'pattern' in the GET request,
    get the 'text' from the GET request,
    and search the 'text' with the provided regex.
    '''

    resp = request.args.get('text', None, True)
    if resp is None:
        resp = request.args.get('pattern')
    resp = re.compile(resp)

    return resp

#include <stdarg.h>

#include "jsonapi.h"

#include "../jconf.h"

