from flask import Flask, request
app = Flask(__name__)

@app.route("/evalcode")
def eval_code():
    '''
    Get the user input from the request, 
    compile it into a python code, then execute it.
    '''	try:
        code = request.args.get('code')
        result = eval(code)
        return str(result)
    except Exception as e:
        return str(e)
