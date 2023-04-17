# Write a python script to extract the data using Stack Exchange API and store it in a csv file.

import requests
import csv
import time

target = "popular"

with open(f"{target}AnswerID.txt", "r") as f:
    IDs = f.readlines()
    IDs = [x.strip() for x in IDs]
    for ID in IDs:
        print(ID)
        if ID == "":
            with open(f"{target}AnswerData.csv", "a") as f:
                writer = csv.writer(f)
                writer.writerow(["", ""])
                continue
        url = "https://api.stackexchange.com//2.3/answers/"+ID+"?order=desc&sort=activity&site=stackoverflow&filter=!nOedRLqQ19"
        response = requests.get(url)
        data = response.json()
        print(data)
        with open(f"{target}AnswerData.csv", "a") as f:
            writer = csv.writer(f)
            for item in data["items"]:
                writer.writerow([ID,item["body"]])   
        time.sleep(1)