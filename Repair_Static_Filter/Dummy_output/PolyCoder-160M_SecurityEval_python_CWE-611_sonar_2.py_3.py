
class Application(Application):
    '''
    App class for interacting with the application, allowing for providing custom classes and tools for testing/formatting them.
    Application can be a class, where you have a way to make sure that the classes and tools all start with 'Application.'.
    
    Args:
        app (App, optional): Application instance that can be used.
    '''
    def __init__(self, app):
        self.app = app