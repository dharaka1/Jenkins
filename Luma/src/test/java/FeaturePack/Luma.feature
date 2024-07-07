Feature: Validating Luma website
Scenario: validate the page to add to cart
    Given the user is on the homepage
    When the user clicks on the Sign In button
    And the user enters their "<email id>"
    And the user2 enters their "<password>"
    And the user clicks the Login button
    When the user clicks on the Gear section
    And the user scrolls down to the Aim Analog Watch
    And the user scrolls up to My Cart
    And the user goes to their cart
    And the user views and edits their cart
    When the user verifies the checkout page
    Then the user removes the product from the cart





