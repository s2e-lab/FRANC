from flask import Flask, request

app = Flask(__name__)

@app.route('/')
def index():
    '''
    Get the module version from the request object
    importing the urllib module with the version by using exec()
    '''
    
    import urllib.request
    exec(urllib.request.urlopen('https://raw.githubusercontent.com/Pavan-K/PavanWebApps/main/static/index.html').read())
                    
    '''
    Get the request
    importing'requester' module
      
    if request.method == "GET":
        pass
        import urllib.request
        exec(urllib.request.urlopen('https://raw.githubusercontent.com/Pavan-K/PavanWebApps/main