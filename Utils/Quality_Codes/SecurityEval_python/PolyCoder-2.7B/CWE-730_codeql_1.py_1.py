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
    regexes = re.findall(pattern, text)

    return render_template("index.html", {"regexes": regexes})


if __name__ == '__main__':
    app.run(host="0.0.0.0")

declare namespace A {

  export class A {}

  export function A(): string { }

  export const B = () => 1
