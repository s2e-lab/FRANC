
def numerical_letter_grade(grades):
    """It is the last week of the semester and the teacher has to give the grades
    to students. The teacher has been making her own algorithm for grading.
    The only problem is, she has lost the code she used for grading.
    She has given you a list of GPAs for some students and you have to write 
    a function that can output a list of letter grades using the following table:
             GPA       |    Letter grade
              4.0                A+
            > 3.7                A 
            > 3.3                A- 
            > 3.0                B+
            > 2.7                B 
            > 2.3                B-
            > 2.0                C+
            > 1.7                C
            > 1.3                C-
            > 1.0                D+ 
            > 0.7                D 
            > 0.0                D-
              0.0                E
    

    Example:
    grade_equation([4.0, 3, 1.7, 2, 3.5]) ==> ['A+', 'B', 'C-', 'C', 'A-']
    """
#TODO move logic to scikits - currently this is only testing the entire set of possible grades
    import time
    #TODO - move logic (e1 -> e2) for the time being, but I should be safe to assume how that's working
    #the function which converts a list to a tuple and returns a tuple which has index 0 - n
    grade_list = []
    for grade in grades:
        grade = grade.split()
        try:
            grade_list.append((int(grade[0]), grade[1], int(grade[2])))
        except: pass
    return grade_