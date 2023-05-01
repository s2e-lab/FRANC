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
    env = Environment(loader=FileSystemLoader('templates'))
    template = env.get_template('render.html')
    output_format = env.get_template('output_format.html')
    return output_format.render(template.render(
            name=request.args['name']))

