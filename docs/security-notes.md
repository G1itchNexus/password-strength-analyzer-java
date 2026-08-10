# Password Strength Scoring

A password strength analyzer needs a scoring system to determine whether a password is weak, moderate, or strong.

There is no single "correct" scoring system. Different organizations and security professionals use different criteria and weightings depending on their security requirements.

When designing a scoring system, the goal is to identify characteristics that make a password more resistant to guessing, brute-force attacks, and common password attacks.


## Questions to Consider

- What characteristics make a password secure?
- Which characteristics should contribute the most points?
- Should weak characteristics result in point deductions?
- How should common passwords and predictable patterns affect the score?


## Possible Evaluation Criteria

### Length
Longer passwords are generally more secure because they increase the number of possible combinations an attacker must try.

### Uppercase and Lowercase Letters
A mix of lowercase and uppercase letters creates more variation.

### Numbers
Including numbers increases the character set available in the password.

### Special Characters
Special characters such as !, @, #, $, %, and & add complexity and make passwords harder to guess.

### Common Passwords
Passwords such as "password", "admin", and "qwerty" should be flagged because they are frequently used and easily guessed.

### Predictable Patterns
Patterns such as:
- 123456
- abc123
- password2026
can reduce password strength because attackers commonly test these patterns.


## Password Strength Scoring Model
The password strength analyzer uses a point-based scoring system.

### Positive Factors

| Criterion          | Points |
| ------------------ | ------ |
| Length             | +25    |
| Uppercase Letters  | +15    |
| Lowercase Letters  | +15    |
| Numbers            | +20    |
| Special Characters | +25    |

Maximum possible score: 100


### Negative Factors

| Criterion                | Penalty |
| ------------------------ | ------- |
| Common Password Detected | -50     |
| Common Pattern Detected  | -40     |


### Strength Levels

| Score Range | Classification |
| ----------- | -------------- |
| 0–39        | Weak           |
| 40–69       | Moderate       |
| 70–100      | Strong         |


### Design Considerations

A password should not be considered strong simply because it contains a variety of character types. Common passwords and predictable patterns significantly reduce security and should result in substantial score penalties.

The scoring model should reward complexity while discouraging commonly used and easily guessed passwords.

