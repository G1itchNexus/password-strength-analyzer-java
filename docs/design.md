# Password Strength Analyzer Design

## Class 1: PasswordAnalyzer

Attributes:
- None

Responsibilities:
- Check length.
- Detect common patterns.
- Analyze character composition.
- Calculate score.
- Generate feedback.


## Class 2: AnalysisReport

Attributes:
- score
- strengthLevel
- recommendations
- detectedIssues

Responsibilities:
- Store score.
- Store strength level.
- Store recommendations.
- Store detected issues.


## Program Flow

1. User enters a password.
2. PasswordAnalyzer receives the password.
3. PasswordAnalyzer checks:
   - Length
   - Uppercase letters
   - Lowercase letters
   - Numbers
   - Special characters
   - Common passwords
   - Common patterns
4. PasswordAnalyzer calculates a score.
5. PasswordAnalyzer determines the strength level.
6. PasswordAnalyzer generates recommendations.
7. An AnalysisReport object is created.
8. The AnalysisReport is displayed to the user.