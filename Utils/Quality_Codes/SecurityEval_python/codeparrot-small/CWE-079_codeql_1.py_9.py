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

    # We first have these values in our env file:
    name = request.args.get('name')
    env = Environment(loader=FileSystemLoader(path)).get_template('generic.html')

    # Now we get the template, with values of all of them.
    f = env.get_template('generic.html')
    f.render(context={}, env=env)

    # Our output template
    # The template is rendered exactly as:
    # http://flask.pocoo.org/docs/en/latest/modularenv.html
    t = '<span class="apptitle">%