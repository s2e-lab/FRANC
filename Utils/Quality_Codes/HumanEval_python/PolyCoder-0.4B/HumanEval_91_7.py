
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
    # This was not an easy and simple method
    # but it is in the example, so I'm going to loop till EOF
    in_string = "".join([s[1:].lower() for s in S.split()]).upper()
    if len(s[1:])!= len(S):
        return 0
    else:
        return 1 + len(in_string)%2 == 0
    
