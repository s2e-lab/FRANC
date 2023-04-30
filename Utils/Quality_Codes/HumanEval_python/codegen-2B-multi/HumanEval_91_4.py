
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
    
    # The number of Boredom sentences will be returned.
    n = 0

    # Loop characters.
    for c in reversed(S):

        # Sentences are "bored" when it contains the word "I" at it's start.
        if c == 'I':
            n += 1
            
        # If there's a non-letter character between the current letter and the
        # next letter then it might or might not be a bored sentence.
        elif c!= '.' and c!= '?' and c!= '!':
            continue