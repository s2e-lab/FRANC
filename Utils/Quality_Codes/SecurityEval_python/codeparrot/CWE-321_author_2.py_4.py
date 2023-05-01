import openai



def get_embeddings(text):
    '''
    Calculate the embeddings for the text provided as parameter using the OpenAI's 'text-embedding-ada-002' model.
    Then, return a list of the embeddings.
    '''
    embedding = []
    with open(text, encoding='utf8') as fid:
        for line_no, line in enumerate(fid):
            values = line.split()
            if len(values)!= 2:
                continue
            embedding.append(' '.join(values[0:-1]).split())
    return embedding


# Copyright (C) 2003-2007  Robey Pointer <robeypointer@gmail.com>
#
# This file is part of paramiko.
#
# Paramiko is free software; you can redistribute it and/or modify it under the
# terms of the GNU