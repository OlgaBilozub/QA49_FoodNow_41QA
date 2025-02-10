# Olga Bilozub - Aspiring QA Engineer  

  
 
</head>
<body>
  <div>
    <h1>Hi there, I’m Olga 👋</h1>
    <p>Welcome to my page! Aspiring QA Engineer and web enthusiast.</p>
  </div>
</body>
</html>

# Automation Testing of an Online Grocery Store

## Project Overview
This project focuses on the functional and automated testing of a web-based grocery store. The goal was to ensure the platform's reliability, usability, and functionality through a combination of manual and automated testing methods.

---

## Tools and Technologies Used
- **Automation Tools**: Selenium WebDriver, TestNG  
- Test Management: TestLink,  Jira   
                  
- API Testing: Postman  
  

# Au Jenkins  

---

## Test Artifacts

### Test Plans and Documentation
-# Automation Te  
  [Test-Plan](#) *(https://docs.google.com/spreadsheets/d/1JqGZvXkzXCcFHGeoQQbiMOXPyssO1ud9tdIVJUgizeI/edit?usp=sharing)*  
-ion Testing of  
  [Test Case Design Map](#) *(https://drive.google.com/file/d/1NNNCw2ZbXiaWPt7LJrvFVcRyROy3aqH1/view?usp=sharing)*  

### Test Cases
- Exported test cases from TestLink:  
  [Download Test Cases (.pdf)](#) *(https://testlink.ait-tr.de/index.php?caller=login&viewer=)*  

### Bug Reports
- Detailed bug reports created in Jira:  
  [Example Bug Report](#) *(https://ait-learn.atlassian.net/jira/software/projects/QA41/boards/573/backlog?selectedIssue=QA41-13)*
  
After placing an order, the system displays an incorrect date (inconsistency with the date when the order was made). This can cause confusion for users and logistics.

1.Open 

2.Add Steak to Cart

3.Select to Cart

4.Click Proceed to checkout

5.Enter Address and date 01.02.2025

6.Pay attention to the date displayed

ER:  The delivery date must match the date selected by the user.

AR: The delivery date is selected incorrectly(28.01.2025)
___________________________________________________________________

The Phone Number field accepts an unsupported format :    11111111

1.Open 

2.Click on the authorization logo in the header

3.Select register

4.Enter data: 

First name

Last Name

E-mail

Password

Phone Number  111111

5.Click on the link "register"

6.Pay attention to the phone format

ER: The form should reject an invalid phone number and show an error message.

AR: Registration is successful.
______________________________________________________________________
When registering on the site, Last Name field accepts the @ symbol as part of the name, for example, QA@, which does not meet the requirements and may cause problems with displaying the name in the profile or documents.

1.Open 

2.Click on the authorization logo in the header

3.Select register 

4.Enter data:

First Name 

Last Name         QA@
E-mail

Password

Phone number

5.Click on the link "register"

6.Please note that registration is successful with an incorrect value.

ER:The form should reject a name containing the @ symbol with the error message:
- “The name must contain only Cyrillic letters.”
- “@ symbols, numbers, and special characters are not allowed in the name.”
- 
AR: Registration completes successfully, although the name contains an invalid @ symbol.
_________________________________________________________________________

On the Home page the images is broken

1.Open 

2.Pay attention on all images

ER: The img is displayed correctly

AR: Img is broken

### Test Execution Results
- Results from TestLink execution:  
  [Test Execution Report](#) *(https://testlink.ait-tr.de/index.php)*  

### Screenshots and Logs
-**: TestLink  
- **Bug Tracking**:  
  [Jenkins Build Logs](#) *(https://drive.google.com/drive/folders/1APRD_txVSBUWNLvZzBDDzbYAX4uz1ASi)*  
-of an Online Grocery Store

## P  
  [View Screenshots](#) *(https://drive.google.com/drive/folders/1APRD_txVSBUWNLvZzBDDzbYAX4uz1ASi)*  

---

## Key Achievements
- Automated the core functional flows (e.g., user login, product search, adding items to cart).  
- Reduced regression testing time by 50% using Selenium WebDriver.  
- Discovered and documented critical and high-severity bugs that were fixed before production release.  
- Improved test coverage to over 90% by designing comprehensive test cases.  

---

## How to Run the Tests
1.**: TestLink  
- **Bug Tra
   ```bash
   git clone https://github.com/your-username/online-grocery-testing.git
   cd online-grocery-testing

 2. Set Up the Environment:
 • Install Java, Maven, and Selenium dependencies.
 • Set up TestNG in your IDE.
 3. Run the Tests:
 • Execute the testng.xml file for automated test execution.
 • View results in the TestNG reports or Jenkins.

Future Improvements
 • Expand test coverage to include mobile browser testing.
 • Integrate API automation using RestAssured.
 • Add performance testing using JMeter.

Contact
 • Email: alonabilozub@gmail.com
 • LinkedIn:

