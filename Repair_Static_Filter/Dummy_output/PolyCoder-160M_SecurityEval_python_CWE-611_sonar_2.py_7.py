
import shutil
import os
import jsonrpc_server
import threading
import logging
import time
import math
import subprocess
import random
import subprocess
import requests
import requests.adapters.Adapter as Request
import time

# Use the standard Python version if not set
if not os.getenv("PYVER"):
    os.environ["PYVER"] = "0"