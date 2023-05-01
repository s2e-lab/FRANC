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
    template_vars = request.args
    environment = Environment(loader=FileSystemLoader(template_vars['path']))
    template_str = env.from_string(template_str)
    template = env.from_string(template_str)
    
    return jinja2.env.from_string(template.render(environment=environment))


@app.route('/generate_and_send_email')
