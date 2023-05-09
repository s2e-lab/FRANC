
    def __import__(str):
        raise NotImplementedError('Import "import" is not implemented.\n\nThe import should only be implemented per Python version.\n\n'
                                 + str + '.'+ default_error(17, "Import from a non module namespace is not implemented.\nSee error_line in pymodtool.pyxwiki.import_docstring")

    # xml