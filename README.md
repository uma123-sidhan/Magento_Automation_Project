🛒 Magento Account Automation
This project automates the account creation and login process on the Magento Test Website using Selenium WebDriver, Cucumber (BDD), and Page Object Model (POM).

📌 Features
✅ Automates User Registration on Magento
✅ Automates User Login with registered credentials
✅ Uses BDD with Cucumber (Gherkin syntax) for test scenarios
✅ Implements Page Object Model (POM) for maintainability
✅ Generates detailed test execution reports

🛠️ Tech Stack
Java – Automation scripting

Selenium WebDriver – UI automation

Cucumber – BDD framework

JUnit/TestNG – Test execution

Maven – Dependency management

Extent Reports – Test reporting

📂 Project Structure
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── pages/               # Page Object classes
│   │   │   ├── stepDefinitions/     # Cucumber step definitions
│   │   │   ├── runners/             # Test runners for execution
│   │   ├── resources/
│   │   │   ├── features/            # BDD feature files
│   │   │   ├── config/              # Configuration files (if any)
├── reports/                         # Execution reports
├── test_cases/                       # Documented test cases (Excel file)
├── execution_proof/                  # Screenshots/recordings of test execution
├── pom.xml                           # Maven dependencies
└── README.md                         # Project documentation
🚀 Setup Instructions
🔹 Prerequisites
Java (JDK 19 )

Maven installed

ChromeDriver/GeckoDriver installed

Git installed

🔹 Installation
Clone the repository

git clone <repo-url>
cd magento-account-automation
Install dependencies

mvn clean install
🔹 Run Tests
To execute the tests, use:

mvn test
or run directly from your test runner (JUnit/TestNG).

📸 Proof of Execution
Screenshots and execution reports are available in the execution_proof/ folder.

📄 Test Cases
The documented test cases are stored in an Excel file inside the test_cases/ directory.

📜 BDD Scenarios (Gherkin)
Feature: User Registration & Login
gherkin Language
Feature: User Account Management  
  Scenario: Register a new user on Magento  
    Given I navigate to the Magento registration page  
    When I enter valid registration details  
    And I submit the registration form  
    Then My account should be successfully created  

  Scenario: Login with a registered user  
    Given I navigate to the Magento login page  
    When I enter valid login credentials  
    And I click the Sign In button  
    Then I should be logged into my account successfully  
🔍 Reporting
Test execution reports will be available in the reports/ folder.

📧 Contact
For any issues or contributions, feel free to raise an issue or submit a pull request. 🚀

Magento_TestCase.xlsx
I have Testcases in the Excel file.
