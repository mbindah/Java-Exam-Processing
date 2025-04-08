# Strathmore University Examination Processing System  
**Developer:** Olive Mbinda  
**Student ID:** [Your Student ID, e.g., 145583]  
**Submission Date:** 10th April 2025  

---

## Project Overview  
A Java program that processes examination results for Strathmore University, featuring:  
- Student data management (name, 6-digit numeric ID)  
- Marks input for 5 core subjects  
- Automated grading based on Strathmore's official system  
- Professional transcript generation  

---

## Technical Specifications  
**Language:** Java 17  
**Files:**  
| File                | Purpose                                  |  
|---------------------|------------------------------------------|  
| `Main.java`         | Program entry point and workflow control |  
| `Student.java`      | Data model for student records           |  
| `GradeEvaluator.java` | Implements Strathmore grading logic      |  
| `ReportCard.java`   | Generates official transcripts           |  
| `InputHelper.java`  | Handles all input validation             |  

---

## Key Features  
✔ **Strict Data Validation**  
   - 6-digit numeric student IDs (e.g., `145583`)  
   - Marks constrained to 0-100 range  
   - Name fields accept alphabetic characters only  

✔ **Official Grading Scale**  
| Average | Grade | Remarks                   |  
|---------|-------|---------------------------|  
| ≥ 75    | A     | Excellent Performance     |  
| ≥ 65    | B+    | Very Good Performance     |  
| ≥ 60    | B     | Good Performance          |  
| ≥ 50    | C     | Satisfactory Performance  |  
| ≥ 40    | D     | Marginal Pass             |  
| < 40    | E     | Unsatisfactory Performance|  

✔ **Transcript Includes**  
   - Student identification details  
   - All subject marks with percentages  
   - Calculated average and final grade  
   - Performance assessment remarks  
   - Date of report generation  

---

## How to Execute  
1. **Requirements:**  
   - Java JDK 17+  

2. **Run Commands:**  
```bash
javac Main.java  
java Main