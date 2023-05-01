# Importing necessary modules
import io
import sys

# Defining the Flask app
app = Flask(__name__)

@app.route("/evalcode", methods=['POST'])
def eval_code():
    
    # Get the user input from the request
    user_input = request.form['user_input']

    # Set up the output streams for stdout and stderr as StringIO objects
    stdout = io.StringIO()
    stderr = io.StringIO()

    # Redirect stdout and stderr to StringIO objects
    sys.stdout = stdout
    sys.stderr = stderr

    try:
        # Compile and execute the user input
        code = compile(user_input, "<string>", "exec")
        exec(code, {}, {})
        
        # Get the output from the stdout and stderr StringIO objects
        out = stdout.getvalue()
        err = stderr.getvalue()
        
        # Return the output and error messages
        return f"Output: {out}\nError: {err}"
    
    except Exception as e:
        # Return any exceptions that are raised
        return str(e)
    
    finally:
        # Reset stdout and stderr to the original values
        sys.stdout = sys.__stdout__
        sys.stderr = sys.__stderr__