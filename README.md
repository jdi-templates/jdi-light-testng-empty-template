# JDI Light Testng empty template
Empty template for Test Automation project with JDI Light library (without any tests, only the structure)

Powered by [JDI Light](https://github.com/jdi-testing/jdi-light) and Selenium

# Instruction:
1. Download template and unpack in appropriate folder

2. Open project in IDE (for example IntelliJIdea)

3. There is no any existing tests, only project structure without any specific namespaces and files

4. USE Maven profile jdk16 in case on JDK16+ usage (not active by default)

5. Reporting: Allure is enabled, after running tests just run **allure:serve** in maven plugins (allure should be installed locally)

6. Parameters that can be changed:
- File src/resourses/common.properties There is a setting to run tests in headless mode, so if you want to see browser, you should remove ´--headless´ parameter
- File src/resources/test.properties contains all settings for JDI. Review them and change if it's required. Remember that values in {} can be changed via maven run parameters

7. TestNg Retry and before after listeners: You can also modify rules of retry tests (now it is 1 retry for each test)
   and actions before/after all tests (now it prints test name and result) in **testng** folder

8. Template also contain GitHub actions run template in .github folder. Remove it if you don't use GitHub to run tests
