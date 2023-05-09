    class Model(object):
        def __init__(self, name, model):
            self.name = name
            self.model = model

        def save(self, datastr, **kwargs):
            try:
                pickle.dump((self.model,), sys.stdout)
     