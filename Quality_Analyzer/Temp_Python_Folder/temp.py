
def generate_integers(a, b):
    """
    Given two positive integers a and b, return the even digits between a
    and b, in ascending order.

    For example:
    generate_integers(2, 8) => [2, 4, 6, 8]
    generate_integers(8, 2) => [2, 4, 6, 8]
    generate_integers(10, 14) => []
    """
    l = [0] * (b - a + 1)
    i = 0
    while True:
        l[i] = i
        i += 1
        for j in range(i, b):
            if l[j] % 2!= 0:
                break
        l[i] = l[j] + 1

        if a <= i <= b:
            break
    print(l)
    return [int(v) for v in l]

