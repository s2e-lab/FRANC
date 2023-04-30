
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
    # Solution:
    # Since the input is always a list of unique characters,
    # when processing the words, find the difference between the current word(from position 0) and the next one after it. If the difference is 0,
    # it means that it is the same one, so add it to the buffer, otherwise, reset the buffer.
    # So, we start from the last byte in buffer and iterate over the input word, and if the difference is 0, replace the current one
    # by the next one, and if not 0, then we add the current word to