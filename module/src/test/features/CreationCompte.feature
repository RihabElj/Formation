@PageCreation
Feature: Creation Compte
  je veux creer un compte en tant que utilisateur

  @Creation
  Scenario: creation compt homme
    Given saisir URL de site:"https://automationexercise.com/"
    When click to Signup_login
    And whrite Name "adam"
    And whrite mail"tesstin@gmail.com"
    And Click to the buton signup
    Then Vérification information account
    When fill title
    And fillpassword"rihab123"
    And fill date of birth "13" , "11" et "1995"
    And Select checkbox Sing up newsletter
    And Select checkbox Receive special offers partners
    And fill Firts name:"test",Last name:"ben test" ,Company:"test",Adresse:"Bizerte",Adresse2:"Ras Jebel"
    And fill again Country:"Canada",State:"canada",City:"canada",Zipcode:"Zipcode",Mobile Number:"Mobile Number"
    And click Create Account button
    Then Verify that "ACCOUNT CREATED!"is visible

    @connexion
    Scenario: conexion compte homme
    Given saisir URL de site:"https://automationexercise.com/"
    When click to Signup_login