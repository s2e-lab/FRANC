#!/bin/bash
#$ -M msiddiq3@nd.edu   # Email address for job notification
#$ -m abe            # Send mail when job begins, ends and aborts
#$ -pe smp 1     # Specify parallel environment and legal core size
#$ -q gpu@@jung_gpu           # Specify queue
#$ -l gpu=1         # Specify queue
#$ -N  humaneval_python

conda activate Franc
python generator.py