
def compare(game,guess):
    """I think we all remember that feeling when the result of some long-awaited
    event is finally known. The feelings and thoughts you have at that moment are
    definitely worth noting down and comparing.
    Your task is to determine if a person correctly guessed the results of a number of matches.
    You are given two arrays of scores and guesses of equal length, where each index shows a match. 
    Return an array of the same length denoting how far off each guess was. If they have guessed correctly,
    the value is 0, and if not, the value is the absolute difference between the guess and the score.
    
    
    example:

    compare([1,2,3,4,5,1],[1,2,3,4,2,-2]) -> [0,0,0,0,3,3]
    compare([0,5,0,0,0,4],[4,1,1,0,0,-2]) -> [4,4,1,0,0,6]
    """
    if not guess.shape == guess.shape[0]:
        print("Error: expected shapes of guess and guess to be of the same length.")
        print("guess.shape",guess.shape[0],guess.shape[1])
        print("match.shape",match.shape[0],match.shape[1])
        return match,guess
    score = match.sum(axis=0)
    d2 = match.abs() == score
    for i in range(guess.shape[1]):
        index = match[:,i