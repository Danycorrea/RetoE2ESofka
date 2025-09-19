Feature: Flujo de compra en Demoblaze

  @CompraConDosProductos
  Scenario: Finalizar compra agregando dos productos
    Given el usuario ingresa a la página de Demoblaze
    When agrega dos productos al carrito
    And visualiza el carrito
    And completa el formulario de compra
    Then debería ver el mensaje 'Thank you for your purchase!'