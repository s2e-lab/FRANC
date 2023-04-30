
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
    stack = []
    boredoms = 0
    count_words = 0
    for word in S:
        count_words += 1
        if word in ("I", "you", "yes", "no", "don't", "don't", "don't", "don't"):
            if len(stack) > 1 and stack[-1][0] == word:
                stack[-2][1] += 1
            continue
        stack.append({"word": word, "count": 1})      # [word, count] pairs
    for i