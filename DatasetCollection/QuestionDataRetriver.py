# Write a python script to extract the data using Stack Exchange API and store it in a csv file.

import requests
import csv
import time
import json

target = "new"

with open(f"{target}IDJava.txt", "r") as f:
    IDs = f.readlines()
    IDs = [x.strip() for x in IDs]
    for ID in IDs:
        print(ID)
        url = "https://api.stackexchange.com/2.3/questions/"+ID+"?order=desc&sort=activity&site=stackoverflow&filter=!nOedRLbBQj"
        response = requests.get(url)
        data = response.json()
        print(data)
        if "items" not in data.keys():
            writer.writerow([ID,"", "", "", "", ""])  
            continue
        with open(f"{target}DataJava.csv", "a") as f:
            writer = csv.writer(f)
            if len(data["items"]) == 0:
                writer.writerow([ID,"", "", "", "", ""])   
                continue
            for item in data["items"]:
                accepted_answer_id = ""
                if 'accepted_answer_id' in item.keys():
                    accepted_answer_id = item["accepted_answer_id"]
                writer.writerow([ID,item["title"], item["body"], item["link"], item["is_answered"], accepted_answer_id])   
        time.sleep(1)