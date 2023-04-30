
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
    words = [x for x in sentence.replace(' ', '').lower() if x.isalpha()]
    lengths = [i for sub in words for i in range(len(sub))]
    result = ''
    for word in word_permute(words):  # permute on list
        for i in range(min(lengths)-len(word)+1):
            s = [word[:i] + word[i:] for i in range(len(word))]
            res = "".join(s)
            if res not in words