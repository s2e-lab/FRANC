import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    embeddings = []

    # Tokenize.
    text = re.sub(r"['", "]", text)
    text = text.replace("[", " [")
    text = text.replace("]", " ]]")

    # Tokenize.
    for token in tokenize.split(text.lower()):
        if not token in embeddings and token.lower() not in RULE_SET:
            embeddings.append(token.lower())

    return embeddings


