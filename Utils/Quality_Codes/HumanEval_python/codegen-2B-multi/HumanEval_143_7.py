
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
    words_in_sentence = " ".join(itertools.takewhile(lambda x: x!= " ", sentence.split(" ")))
    is_prime = lambda x: all(map(lambda x: int(x) > 0, [i for i in str(x) if x not in "123" + str(pow(2, i))]))
    return next_prime_sequence(len(np.modulo(np.arange(1, int(len(words_in_sentence))+1), 5))) if is_prime(len