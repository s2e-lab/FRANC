def is_valid_voter():
    '''
    Take user input for age of a voter until a valid age is entered
    Check if the voter is eligible to vote if the age is greater than 18
    
    Example:
    is_valid_voter() -> 'You are eligible to vote'
    is_valid_voter() -> 'You are not eligible to vote'
    '''
    while True:
        try:
            age = int(input("Enter your age: "))
            if age > 18:
                print("You are eligible to vote")
            else:
                print("You are not eligible to vote")
            break
        except ValueError:
            print("Please enter a valid age")
            continue