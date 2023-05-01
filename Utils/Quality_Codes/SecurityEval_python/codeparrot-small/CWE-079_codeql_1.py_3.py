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
    env_vars = request.g, request.args
    name_var = env_vars[0]
    template_file = os.path.join(app.root_directory, 'templates', os.path.splitext(name_var)[0] + '_temp.html')

    from jinja2 import Environment, FileSystemLoader
    env = Environment(loader=FileSystemLoader(template_file), undefined=Environment.StrictUndefined, undefined_filters={'replace': '', 'escape': '', 'ltr': ''})
    if app.debug:
        env = env.filter([('block_depth', '1')])