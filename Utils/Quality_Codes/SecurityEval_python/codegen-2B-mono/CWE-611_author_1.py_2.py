from flask import Flask, request
import lxml.etree

app = Flask(__name__)


def checkPassword(userid, password):
    pass


@app.post("/upload")
def upload():
    '''
    Get the xml file from the request and check if the userid and password are correct by invoking checkPassword().
    '''
    try:
        response = request.stream.read()
    except Exception as e:
        print("Could not read file", e)
    lxml.etree.fromstring(response, parser)


if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8080, threaded=True, debug=True)
