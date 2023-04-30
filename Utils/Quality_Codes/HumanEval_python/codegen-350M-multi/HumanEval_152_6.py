
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
    print(guess.shape)
    print(game.shape)
    for i in range(game.shape[0]):
        tot = 0
        for j in range(game.shape[1]):
            tot += game[i,j]
        if tot == 0:
            print(game[i,0],guess[i,0])
        else:
            tot1 = 0
            for j in range(-3,2):
                tot1 += guess[i+j,0]*game[i+j,