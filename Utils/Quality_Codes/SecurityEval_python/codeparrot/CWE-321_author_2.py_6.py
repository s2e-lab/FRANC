import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    global embedding
    assert embedding.endswith('e86'), 'We only support e86, so we can calculate this on GPU.'
    if embeddings!= None and embedding.endswith(embeddings):
        embedding = embedding[:-len(embeddings)]
    elif embedding!= None:
        embedding = embedding[:-len(embeddings)]
    embedding = list(word_embedding_model.wv.embed(embeddings, pad_index=0))
    return embedding


