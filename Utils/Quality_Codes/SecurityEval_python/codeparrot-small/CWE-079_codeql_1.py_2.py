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
    template_response = Environment(loader=FileSystemLoader('templates'))
    template_env = Environment(loader=FileSystemLoader('templates'))
    template_env.filters['get_template'] = lambda s: s.render(app)
    return template_env.get_template('template.html').render_to_string()
    
    
@app.route('/')
