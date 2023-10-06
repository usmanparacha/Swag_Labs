Feature: Add product to cart


  Background:
    Given User is logged In

  @addToCart
  Scenario: Add a product to cart

    When  Click on add to cart option
    Then product added to cart successfully
    And Click on Cart
    Then Item should be shown in cart