@ChallengeBuilders
Feature: Cadastro

  @Cadastro
  Scenario: Deve cadastrar um usuario
    Given que estou na Pagina Inicial
    When clicar em Cadastrar
    And preencher campo "Celular" com o valor "11999999999"
    And preencher campo "Nome" com o valor "Edson Lima Costa"
    And devo clicar em localizacao automatica
    And clicar em sim
    Then devo validar a home