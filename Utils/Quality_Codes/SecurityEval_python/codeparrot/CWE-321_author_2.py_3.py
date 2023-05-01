import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    text_embeddings = list()
    text_embeddings.append(get_text_embedding(text, text_size=4096))
    embeddings = list()

    for row in text_embeddings:
        embeddings.append({'text': row[0], 'weight': row[1]})
    return embeddings

