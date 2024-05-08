Feature: Register User
    As visitor to the website
    I want to register as a new user
    So that I can access the website's feature

    Scenario: User registers with valid information
        Given I am on the registration page
        When I fill in the registration form with valid information
        And I submit the registration form
        Then I should see a success message
        And I should be logged in as a registered user
