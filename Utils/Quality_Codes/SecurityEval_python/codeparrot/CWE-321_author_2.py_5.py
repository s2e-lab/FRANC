import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    # load model
    embeddings = []
    np.random.seed(0)
    # create word_index dict
    word_index_list = []
    # print('Reading word index from corpus')
    for row in openai.text_corpus_reader(text):
        word_index_list = row["word_index"]
        for i in xrange(len(word_index_list)):
            word_index = word_index_list[i]
            if word_index not in embeddings:
                embeddings.append(word_index)
                word_index_list = []
    #