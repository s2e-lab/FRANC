import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    model = openai.get_model(model_path)
    layer1 = model.layers[0]
    layer2 = model.layers[1]
    layer3 = model.layers[2]
    layer4 = model.layers[3]
    layer5 = model.layers[4]

    embeddings = {}
    if layer1.get_input_embedding_parameter()['type'] == 'fixed':
        vectors = layer1.get_input_embedding_parameters()
        matrix = np.array(vectors['arr'])
        embedding = {
            'text_embedding': matrix,
            'dropout