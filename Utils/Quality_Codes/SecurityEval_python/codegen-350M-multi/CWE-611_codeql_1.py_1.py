from flask import Flask, request
import lxml.etree

app = Flask(__name__)


@app.post("/upload")
def upload():
    '''
    Get the xml_src from the request, parse it and return it as string.
    '''
    file_path = request.files['file-text'].filename

    # make sure the file path is valid
    if not os.path.isfile(file_path):
        raise HTTPError(404)

    import xlrd
    xls_file = xlrd.open_workbook(os.path.dirname(file_path))
    sheet = xls_file.sheet_by_name("Sheet 1")

    # read the text from file.
    file_text = sheet.cell_value(file_path, 0)