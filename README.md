# Olga Bilozub - Aspiring QA Engineer  

  
 
</head>
<body>
  <div>
    <h1>Hi there, I’m Olga 👋</h1>
    <p>Welcome to my page! Aspiring QA Engineer and web enthusiast.</p>
  </div>
</body>
</html>

Automation Testing of an Online Grocery Store

Project Overview

This project focuses on functional and automated testing of a web-based grocery store. The main goal was to ensure the platform’s reliability, usability, and functionality through a combination of manual and automated testing techniques.

Tools and Technologies Used


 • Automation Tools: 
 Selenium WebDriver, TestNG
 
 • Test Management: 
 TestLink, Jira
 
 • API Testing: 
 Postman
 
 • CI/CD:
 Jenkins

Test Artifacts

1. Test Plans and Documentation
 
 • 📄 Test Plan (https://docs.google.com/spreadsheets/d/1JqGZvXkzXCcFHGeoQQbiMOXPyssO1ud9tdIVJUgizeI/edit?usp=sharing)

 • 📌 Test Case Design Map (https://drive.google.com/file/d/1NNNCw2ZbXiaWPt7LJrvFVcRyROy3aqH1/view?usp=sharing)

2. Test Cases
 
 • ✅ Exported Test Cases from TestLink (PDF) (https://testlink.ait-tr.de/index.php?caller=login&viewer=)

3. Bug Reports
 
 • 🐞 Example Bug Report in Jira (https://ait-learn.atlassian.net/jira/software/projects/QA41/boards/573/backlog?selectedIssue=QA41-13)

Examples of Reported Bugs:

1️⃣ Incorrect Order Date Displayed
 • Steps to Reproduce:
 1. Open the website.
 2. Add a steak to the cart.
 3. Proceed to checkout.
 4. Enter an address and select the delivery date: 01.02.2025.
 5. Observe the displayed date.
 • Expected Result: The delivery date must match the date selected by the user.
 • Actual Result: The system displays 28.01.2025, which is incorrect.

2️⃣ Phone Number Field Accepts Unsupported Format
 • Steps to Reproduce:
 1. Open the website.
 2. Click on the authorization logo in the header.
 3. Select “Register”.
 4. Enter user details and input phone number 111111.
 5. Click “Register”.
 • Expected Result: The form should reject an invalid phone number and show an error message.
 • Actual Result: Registration is successful, despite an invalid phone format.

3️⃣ Last Name Field Accepts Invalid Characters
 • Steps to Reproduce:
 1. Open the website.
 2. Click on the authorization logo in the header.
 3. Select “Register”.
 4. Enter Last Name: QA@.
 5. Click “Register”.
 • Expected Result: The form should reject a name containing the @ symbol and show an error message.
 • Actual Result: Registration completes successfully, even with an invalid last name.

4️⃣ Broken Images on the Home Page
 • Steps to Reproduce:
 1. Open the website.
 2. Check all images on the home page.
 • Expected Result: All images should display correctly.
 • Actual Result: Some images are broken.

Test Execution Results

 • 📊 Test Execution Report from TestLink
 (https://testlink.ait-tr.de/index.php)
 
 Screenshots and Logs
 
 • 📷 Jenkins Build Logs
 (https://drive.google.com/drive/folders/1APRD_txVSBUWNLvZzBDDzbYAX4uz1ASi)
 
 • 🖼️ Bug Screenshots 
 (https://drive.google.com/drive/folders/1APRD_txVSBUWNLvZzBDDzbYAX4uz1ASi)

Key Achievements

✔️ Automated core functional flows (user login, product search, adding items to cart).

✔️ Reduced regression testing time by 50% using Selenium WebDriver.

✔️ Discovered and documented critical and high-severity bugs before the production release.

✔️ Improved test coverage to 90% through well-structured test cases.

How to Run the Tests

1️⃣ Clone the Repository

git clone https://github.com/your-username/online-grocery-testing.git
cd online-grocery-testing

2️⃣ Set Up the Environment
 • Install Java, Maven, and Selenium dependencies.
 • Configure TestNG in your IDE.

3️⃣ Run the Tests
 • Execute testng.xml for automated test execution:

mvn test

 • View results in TestNG reports or Jenkins.

Future Improvements

🚀 Expand test coverage to include mobile browser testing.

🚀 Integrate API automation using RestAssured.

🚀 Add performance testing using JMeter.

Contact

📧 Email: alonabilozub@gmail.com

🔗 LinkedIn: www.linkedin.com/in/olga-bilozub-b1a66b353




 









 
