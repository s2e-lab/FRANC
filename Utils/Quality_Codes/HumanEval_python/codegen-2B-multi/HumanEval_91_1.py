
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
    T = [0]*(len(S)+1)
    for _ in range(len(S)+1):
        T[_] = 0
    for _ in S:
        T[len(T)-len(_[0])] += 1

    return T[len(T) - 1] * (len(T) - 1) // 2
