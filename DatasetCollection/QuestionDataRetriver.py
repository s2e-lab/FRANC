# Write a python script to extract the data using Stack Exchange API and store it in a csv file.

import requests
import csv
import time
import json

target = "popular"

with open(f"{target}ID.txt", "r") as f:
    IDs = f.readlines()
    IDs = [x.strip() for x in IDs]
    for ID in IDs:
        print(ID)
        url = "https://api.stackexchange.com/2.3/questions/"+ID+"?order=desc&sort=activity&site=stackoverflow&filter=!nOedRLbBQj"
        response = requests.get(url)
        data = response.json()
        print(data)
        with open(f"{target}Data.csv", "a") as f:
            writer = csv.writer(f)
            for item in data["items"]:
                accepted_answer_id = ""
                if 'accepted_answer_id' in item.keys():
                    accepted_answer_id = item["accepted_answer_id"]
                writer.writerow([ID,item["title"], item["body"], item["link"], item["is_answered"], accepted_answer_id])   
        time.sleep(1)