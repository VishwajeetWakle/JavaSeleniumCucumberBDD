Feature: Footer Links Validation

  Scenario: Validate that the footer is visible
    Given I am on the Hotstar home page
    Then I should see the footer
    
  Scenario: Validate that the About Us link in the footer is clickable
    Given I am on the Hotstar home page
    When I click on the "About Us" link in the footer
    Then I should be navigated to the About Us page
    
  #Scenario: Validate that the Careers page link in the footer is clickable
    #Given I am on the Hotstar home page
    #When I click on the "Careers" link in the footer
    #Then I should be navigated to the Careers page
    #
  #Scenario: Validate that the Visit Help Center page link in the footer is clickable
    #Given I am on the Hotstar home page
    #When I click on the "Visit Help Center" link in the footer
    #Then I should be navigated to the Visit Help Center page
    #
  #Scenario: Validate that the Share Feedback page link in the footer is clickable
    #Given I am on the Hotstar home page
    #When I click on the "Share Feedback" link in the footer
    #Then I should be navigated to the Share Feedback page
#
  #Scenario: Validate that the Terms of Use link in the footer is clickable
    #Given I am on the Hotstar home page
    #When I click on the "Terms of Use" link in the footer
    #Then I should be navigated to the Terms of Use page
#
  #Scenario: Validate that the Privacy Policy link in the footer is clickable
    #Given I am on the Hotstar home page
    #When I click on the "Privacy Policy" link in the footer
    #Then I should be navigated to the Privacy Policy page
#
  #Scenario: Validate that the FAQs link in the footer is clickable
    #Given I am on the Hotstar home page
    #When I click on the "FAQs" link in the footer
    #Then I should be navigated to the FAQs page
