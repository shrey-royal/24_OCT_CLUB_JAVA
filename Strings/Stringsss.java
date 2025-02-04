public class Stringsss {
    public static void main(String[] args) {
        String str = "String 1";
        String str1 = "String 2";
        
        str1 = "String 1";

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
    }
}

/*
String objects are immutable, which means that once created, their values cannot be changed.

1. Data Validation:
   Design a Java program that validates and sanitizes user-provided email addresses, ensuring they adhere to standard email format rules (e.g., presence of '@' and '.' symbols, proper domain format).

2. Text Processing:
   Create a search engine algorithm that reads and analyzes a text file, enabling users to input a word or phrase to find all occurrences and their respective positions within the document.

3. Data Parsing:
   Develop a CSV parser in Java that reads a comma-separated file, extracts each field, and organizes the data into usable chunks, allowing for further processing or manipulation.

4. Encryption and Decryption:
   Implement a Java application that encrypts sensitive user data (like passwords) using a chosen encryption algorithm and allows decryption for authorized users.

5. User Authentication:
   Build a secure authentication system using hashed passwords in Java, where users' passwords are stored as hashes and compared during login verification.

6. String Manipulation:
   Create a Java program that takes a user's input and formats it into a readable sentence, ensuring proper capitalization and removing leading/trailing spaces.

7. URL Manipulation:
   Design a URL parser in Java that takes a URL string as input and separates it into its constituent parts like protocol, domain, path, and query parameters.

8. Error Handling:
   Develop a log analysis tool in Java that reads log files, extracts error messages, and categorizes them based on timestamp, error codes, and descriptions for easier debugging.

9. Text Analysis:
   Build a Java application that performs sentiment analysis on user-provided text, analyzing the frequency of positive and negative words to gauge sentiment.

10. Internationalization and Localization:
    Create a Java program that manages multi-language support by enabling users to switch between languages, displaying content based on their selected language preference.


Sample Test Cases:

1. Data Validation:
   - Input: "user@example.com"
     - Expected Output: Valid email address
   - Input: "invalid-email"
     - Expected Output: Invalid email address

2. Text Processing:
   - Input Text: "Java is a popular programming language. Java is used for various applications."
     - Search Query: "Java"
     - Expected Output: Positions found at [0, 32]

3. Data Parsing:
   - Input CSV:
     ```
     Name, Age, City
     John, 25, New York
     Emily, 30, San Francisco
     ```
     - Expected Output: Parsed data as a list of arrays or objects containing information for each person.

4. Encryption and Decryption:
   - Input: "SecretPassword123"
     - Expected Output: Encrypted/Hashed password
     - Decryption: Ensure the decrypted password matches the original input.

5. User Authentication:
   - Input: Username: "user123", Password: "Password@123"
     - Expected Output: Hashed password stored securely; successful login using the correct credentials.

6. String Manipulation:
   - Input: "   hello, world!   "
     - Expected Output: "Hello, world!" (formatted sentence with proper capitalization and no leading/trailing spaces)

7. URL Manipulation:
   - Input URL: "https://www.example.com/path/to/resource?param1=value1&param2=value2"
     - Expected Output: Separated components - protocol: "https", domain: "www.example.com", path: "/path/to/resource", query parameters: {"param1": "value1", "param2": "value2"}

8. Error Handling:
   - Input Log:
     ```
     [2023-11-30 10:15:20] ERROR: Database connection failed
     [2023-11-30 10:20:35] ERROR: File not found
     ```
     - Expected Output: Extracted errors categorized by timestamp and error messages.

9. Text Analysis:
   - Input Text: "The movie was fantastic! The acting was superb."
     - Expected Output: Sentiment analysis showing positive sentiment with word frequency analysis.

10. Internationalization and Localization:
    - Input: Select language as "French"
      - Expected Output: Display content in French language as per the user's choice.


*/