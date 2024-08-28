# FRANC
This folder contains the source code of the paper titled "franc: A Framework for Improving the Quality ofAutomatically Generated Code."

## Abstract
In recent years, the use of automated source code
generation utilizing transformer-based generative models has
expanded, and these models can generate functional code ac-
cording to the requirements of the developers. However, recent
research revealed that these automatically generated source codes
contain quality flaws and vulnerabilities. Despite researchers
and practitioners attempting to enhance code generation quality,
retraining large language models is time-consuming and resource-
intensive. As a result, our work presents FRANC, a framework for
recommending more secure and high-quality source code derived
from transformer-based code generation models. FRANC includes
a static filter to make generated code compilable with heuristics
and a quality filter to rank the suggestions based on quality (i.e.,
code and security smells). In addition, FRANC contains techniques for refactoring vulnerable source code. The framework has been instantiated with five Python and Java code generation
models and six prompt datasets, including a newly proposed one
in this work, SOEVAL. The static filter improves from 9% to 46%
Java suggestions and 10% to 43% Python suggestions regarding
compilability. The average improvement over the NDCG score for
the ranking system is 0.0763, and the repairing techniques repair
the highest 80% of prompts. The framework, FRANC takes, on
average, 1.9845 seconds for Java; for Python, it takes 0.0846.

## File Structure

1. **Benchmarks**: Contains the benchmark datasets used in the paper.
2. **DatasetCollection**: Contains the code for collecting the dataset from StackOverflow and creating SOEval.
3. **SuggestionGenerator**: Contains the code for the suggestion generator using OpenAI's ChatGPT and HuggingFaces's Open-source code generation models. 
4. **Static_Filter**: Contains the code for the static filter in which the generated code is cleaned and made compilable.
5. **Quality_Analyzer**: Contains the code for the quality analyzer in which the generated code is ranked based on the quality.
6. **Quality_Analyzer_Before_Static_Filter**: Contains the code for the quality analyzer before running the static filter.
7. **Repair_***: Contains the code for the repair techniques for the smelly codes. Three Benchmarks folders contain three repair scenarios.
8. **Utils**: Contains the code for the result analysis, repair prompt creation, and samples for NDCG score calculation.
9.  **FRANC_Appendix.pdf**: Contains the appendix of the paper.
 