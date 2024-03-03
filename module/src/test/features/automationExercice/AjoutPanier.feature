
@Panier
Feature: validation panier

Background:
Given saisir URL de site:"https://automationexercise.com/"
    When click to Signup_login
    And Inserer Adresse mail"tesstin@gmail.com"
    When Inserer mot de passe"adam123"
    And Cliquer sur login
    Then vérification connexion compte"Logged in as Rihab"
    

  @Achat
  Scenario: Achat
    When choisir un article
    And cliquer regarde panier
    And cliquer sur check
    And cliquer sur place order
    And remplir name of card
    And remplir Card Number
    And Remplir CVC "555" , Expiration "12" et Annee "2020"
    And cliquer sur Payer
    Then vérification que le paiment est fait "ORDER PLACED!"