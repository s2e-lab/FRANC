from flask import Flask, request
from jinja2 import Environment, FileSystemLoader
app = Flask(__name__)

@app.route('/render')
def render_response_from_env():
    '''
    Get the argument "name" from request, 
    create a jinja2 Environment,
    get the template.html from the environment, and render it.
    '''

    root = dict(request.environ)
    context = Environment(loader=FileSystemLoader('templates'))
    template = Environment(trim_blocks=True)
    template.loader = FileSystemLoader(app.config['TEMPLATES'])

    return template.get_template(root)

@app.route('/login', methods=["GET", "POST"])
