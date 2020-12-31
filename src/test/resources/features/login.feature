  @messanger
  Feature: Messanger Login
    Background :
      Given I am at messanger login page

      @Login
      Scenario: Verify valid Login at messanger page
        When I enter karsimail1@gmail.com into the username on the messanger page
        And I enter 123456 into the password on the messanger page
        And I click on login button on login page
        Then I verify invalid login message on sign in page
