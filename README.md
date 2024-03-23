# Amazon.com_E-commerce_Site_Automation_By_Java_Selenium
### This is a complete project where an e-commerce site [Amazon.com](https://www.amazon.com/) is automated by writing test suites using selenium-webdriver and TestNg as testing framework.
**One modules/page is automated:**
- **Search** </br>


**3 test cases are automated.**

**For failed test cases it will take a screenshot aswell at the point of failure.** </br>

**The test runner code can be extracted from this:**
[TestRunner](https://github.com/tanvirmitul/Amazon_Ecommerce-Site_Automation/blob/main/src/test/java/testrunner/HomePageTestRunner.java)</br>
### Technology: </br>
- Tool: Selenium Webdriver
- IDE: Intellij IDEA
- Build tool: Gradle
- Language: Java
- Testing Framework : TestNG

### Prerequisite: </br>
- Need to install jdk 1.8, gradle and allure
- Configure Environment variable for jdk 1.8, gradle and allure
- Clone this project and unzip it
- Open the project folder
- Double click on "build.gradle" and open it through IntellIJ IDEA
- Let the project build successfully
- Enter your browserstack userName and accessKey in browserstack.yml file
- Click on "Terminal" and run the automation scripts

### Run the Automation Script by the following command:
 ```
 gradle clean test 
 ```
- Selenium will open the browser and start automating.
- After automation to view allure report , give the following commands:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
 ```
**Below is my overall report:** </br>

![Capture](https://github.com/tanvirmitul/Amazon_Ecommerce-Site_Automation/assets/59876702/4af7ec2a-395d-4e5e-a2d9-0ca5ff1d2b0b)  </br>

![Allure1](https://github.com/tanvirmitul/Amazon_Ecommerce-Site_Automation/assets/59876702/4ca1dc4f-7024-4363-bf85-e825208c2bf7) </br>

![Allure2](https://github.com/tanvirmitul/Amazon_Ecommerce-Site_Automation/assets/59876702/dfadd983-7f25-411e-b8d3-2c2badb5c2a9)  </br>

![Allure3](https://github.com/tanvirmitul/Amazon_Ecommerce-Site_Automation/assets/59876702/4f7f903f-5fca-4b53-9b5b-09076d1e45e4)  </br>

![Allure4](https://github.com/tanvirmitul/Amazon_Ecommerce-Site_Automation/assets/59876702/68039bbf-e763-49ff-852b-5a5e8dbe12c0)  </br>

- ## **Here is the overall walkthrough of the project:** [Video](https://drive.google.com/file/d/1dDEzeWQv7v89_W7nniw3-7y80huEWrEs/view?usp=sharing) </br>
