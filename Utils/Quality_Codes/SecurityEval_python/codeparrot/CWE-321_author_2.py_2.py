import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    text = text.decode('utf8')
    data = list()
    for token in get_nltk_data(text):
        if token.word not in ['n', 't'] + ['b'] + ['w'] + ['s'] + [None]:
            continue
        word = token.word.lower()
        if word in ['w', 'f'] and data:
            break
        else:
            data.append(word)
    data.append(None)
    return data


