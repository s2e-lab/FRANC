# FRANC
This project contains the source code of the paper titled "FRANC: A Framework for Improving the Quality ofAutomatically Generated Code", accepted at the 24th IEEE International Conference on Source Code Analysis and Manipulation (SCAM 2024).

## Abstract
In recent years, the use of automated source code generation utilizing transformer-based generative models has grown in popularity. These models can generate code according to the developers’ requirements. However, recent research showed that these automatically generated source codes can contain vulnerabilities and other quality issues. Despite researchers’ and practitioners’ attempts to enhance code generation models, retraining and fine-tuning large language models is not only time-consuming but also resource-intensive and costly. Thus, in this paper, we describe FRANC, a lightweight framework for recommending more secure and high-quality source code derived from transformer-based code generation models. FRANC includes a static filter to make the generated code compilable with heuristics and a quality-aware ranker to sort the code snippets based on a quality score. Moreover, the framework uses prompt engineering to fix persistent quality issues. We evaluated FRANC with five Python and Java code generation models and six prompt datasets, including a newly created one in this work (FRANC). The static filter improves 9% to 46% Java suggestions and 10% to 43% Python suggestions regarding compilability. The average improvement over the NDCG@10 score for the ranking system is 0.0763, and the repairing techniques repair the highest 80% of prompts. FRANC takes, on average, 1.98 seconds for Java; for Python, it takes 0.08 seconds.

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
 