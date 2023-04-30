
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
    words = sentence.split(' ')
    words = [x.lower() for x in words if len(x) >= 1 and x.isalpha()]
    s = ''.join(words)
    while len(s) < len(sentence):
        k = random.randrange(max(1, int(len(s) / len(s))))
        if 2 ** (k-1) <= len(s) and 2**(k-1) <= len(s):
                s += words[random.randrange(len(words))]
