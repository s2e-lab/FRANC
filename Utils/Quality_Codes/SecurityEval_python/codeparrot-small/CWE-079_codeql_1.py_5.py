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
    template_name = request.method.split('_')[1]
    tmpl = Environment(loader=FileSystemLoader('./templates'))
    tmpl.searchpath.append(request.path)
    template = env2.get_template(template_name)
    return template.render(template_name=template_name)

