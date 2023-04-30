
def is_bored(S):
    """
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.
   
    For example:
    >>> is_bored("Hello world")
    0
    >>> is_bored("The sky is blue. The sun is shining. I love this weather")
    1
    """
    punctuation = list('!?')
    boredos = 0
    for i in S:
        if i in '.':
            i =''
        for p in punctuation:
            if i in p:
                # only add the first instance to the boredos
                if p not in i:
                    boredos += 1
                else:
                    break
                
    return boredos
