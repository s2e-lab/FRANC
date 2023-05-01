from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    return '''<html><body>
				<h1>This is your project</h1>
				<p>Module version: v%s</p>
				<p>Dependencies: %s</p>
				<br><br><a href="%s/auth/logout">Logout</a>
                </body></html>''' % (__version__, ', '.join(req.modules.requires), req.app_url)
