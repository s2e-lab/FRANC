import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''

    embeddings = []
    lines = openai.files.open(text).readlines()
    line_iter = itertools.islice(lines, 4)
    for start_index, end_index in line_iter:
        word = lines[start_index].split()
        embedding = (0,) + tuple(line_iter[start_index+1:])
        embeddings.append(embedding)

    print("{} embeddings loaded.".format(len(embeddings)))
    return embeddings


