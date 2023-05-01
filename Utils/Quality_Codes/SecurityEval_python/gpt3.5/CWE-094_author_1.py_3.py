from flask import Flask, request
app = Flask(__name__)

@app.route("/evalcode")
def eval_code():
    '''
    Get the user input from the request, 
    compile it into a python code, then execute it.
    '''	try:
        user_input = request.args.get('code')
        compiled_code = compile(user_input, '<string>', 'exec')
        exec(compiled_code)
        return "Code successfully executed!"
    except Exception as e:
        return f"An error occurred: {e}"

