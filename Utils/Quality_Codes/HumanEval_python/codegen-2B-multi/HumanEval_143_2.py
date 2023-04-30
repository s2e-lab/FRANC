
def words_in_sentence(sentence):
    """
    You are given a string representing a sentence,
    the sentence contains some words separated by a space,
    and you have to return a string that contains the words from the original sentence,
    whose lengths are prime numbers,
    the order of the words in the new string should be the same as the original one.

    Example 1:
        Input: sentence = "This is a test"
        Output: "is"

    Example 2:
        Input: sentence = "lets go for swimming"
        Output: "go for"

    Constraints:
        * 1 <= len(sentence) <= 100
        * sentence contains only letters
    """
    max_num = int(math.sqrt(len(sentence)))
    index = [0] * max_num
    words = word_lengths(len(sentence))
    output = ""
    maxlen = 0
    for start, end in words:
        if start > maxlen:
            output += sentence[index[start-1]:index[start]-1]
            maxlen = 0
        if end == len(sentence): # end-start is index[end]-index[start]
            output += sentence[start:end]
