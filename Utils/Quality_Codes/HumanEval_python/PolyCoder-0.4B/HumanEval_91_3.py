
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
    S = S.lower().strip()
    # Count borrows that are a sentence
    born_count = 1
    for i in S.split("[!():()[]{}!:(),:]\n:()"):
        if ord(i) == ord("": i) and S[i.find(i) : i+1]!= S[i+1:]:
            born_count += 1
    return born_count
