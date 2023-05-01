import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    return [embedding.embeddings.embedding
                       for embedding in openai.Embedding.create_from_saved_model(text)]


