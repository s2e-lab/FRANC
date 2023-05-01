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
    # Get the first argument
    name = request.args.get('name')
    print 'Rendering: %s' % name
    template_dir = request.args['template_dir']
    # Render the jinja2 Environment
    environment = Environment(loader=FileSystemLoader(template_dir))
    return environment.get_template(name)
