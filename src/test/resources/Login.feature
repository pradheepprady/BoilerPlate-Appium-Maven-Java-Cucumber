@test
Feature: Login scenarios

  Scenario Outline: User login to the app and add expenses in a group using splitwise
#    Given I launch the app
    When I click login button
    When I enter <userName> and <passWord>
    When I swipe through the welcome page sliders
    When I select <groupName> fo adding expenses
    When I add <amount> euro expenses with description <desc>
    When I navigate to activity screen
    Then I should see my added expenses <desc>

    Examples:
      | userName                | passWord     | groupName      | amount | desc                                 |
      | "pradheepren@gmail.com" | "Prady@2022" | "Test Group"   | "10"   | "lunch"                              |
#      | "pradheepren@gmail.com" | "Prady@2022" | "Croatia Trip" | "0.5"  | "dont worrry, i will delete this :P" |