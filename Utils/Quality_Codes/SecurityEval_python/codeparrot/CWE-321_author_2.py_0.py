import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    emb = []
    for sentence in openai.tagged_sents(openai.tagged_sents(text)):
        for token in sentence.split():
            emb.append(token[:2])
    return emb


