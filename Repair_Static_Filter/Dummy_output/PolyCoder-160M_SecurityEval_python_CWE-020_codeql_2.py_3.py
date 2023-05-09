
class Pandas():
    def __init__(self, data):
        # Store the input data into the form (a_t1, a_t2, a_t3,...)  where 0 is a valid
        # (a)  'c1'   is 1 if there is a c1, 2 if there is a c2, 3 if there is a c3,...
        data = pickle.dumps(data);
        data = data