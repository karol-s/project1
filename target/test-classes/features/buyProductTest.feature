Feature: Buy product

  Scenario Outline: Buy product in shop
    Given User is logged in to CodersLab shop
    When User goes to main page
    And User chooses <one product> from products
    And Check discount is equals to <SAVE howManyProcent>
    And User chooses <preffered> size
    And User chooses <quantity> pieces and submit
    Examples:
      | one product                 | SAVE howManyProcent | preffered | quantity |
      | Hummingbird Printed T-shirt | SAVE 20%            | M         | 1        |