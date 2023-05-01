import os


def createExecutableFile(data):
    '''
    Create a binary file test.bim and make it executable.
    '''
    test_executable_bin = os.path.join(os.path.dirname(__file__), "test_executable.py")
    bin_path = os.path.join(os.path.dirname(__file__), "bin")
    return os.path.join(bin_path, "test.bim")

