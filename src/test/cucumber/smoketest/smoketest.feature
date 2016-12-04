Feature: The actuator says the application is ok
  Scenario: Query the health endpoint
    When the client calls /health
    Then the client receives status code of 200