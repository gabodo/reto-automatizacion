Feature: Login and Recruitment

  Scenario: Loguearse y realizar contratación
    Given que el usuario está en la página de login
    When ingresa las credenciales "Admin" y "admin123"
    And navega a la funcionalidad "Recruitment"
    And agrega una nueva persona con los datos "Oscar Andres Roa"
    Then debería ver el mensaje de confirmación de éxito
