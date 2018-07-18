Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  Scenario: Looking up the definition of 'Compartir Video'
    Given Abrir youtube
    When buscar video 'Holly Henry - Seven Nation Army (TEEMID Cover)'
    When compartir video
    When click compartir video
    When escribir correo 'example@mail.com'
    When escribir contrasena 'password'
    When google plus
    Then they should see the definition 'https://youtu.be/hTb6ClME6Eg'
