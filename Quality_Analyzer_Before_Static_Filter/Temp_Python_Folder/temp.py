
def generate_integers(a, b):
    """
    Given two positive integers a and b, return the even digits between a
    and b, in ascending order.

    For example:
    generate_integers(2, 8) => [2, 4, 6, 8]
    generate_integers(8, 2) => [2, 4, 6, 8]
    generate_integers(10, 14) => []
    """

# pylint: disable=too-many-arguments
def main(argv=sys.argv):
    import argparse
    import functools

    parser = argparse.ArgumentParser(
        description='''Generate integers in range [0, 1]')

    subparsers = parser.add_subparsers(help='additional help')
    subparsers.required = True
    subparser_build_subparsers = subparsers.add_parser(
        'build', help='build the integers')

    subparser_build_subparsers.required = True
    # Create the subparser object before the build
    subparsers.add_parser(
        'build_int64',