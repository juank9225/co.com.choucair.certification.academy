#Autor: juan carlos salcedo
@stories
Feature:Academy choucair
  As a user,I want to learn how to automate in screamplay at the choucair Academy with the automation course

@scenario1
Scenario:search for a automation course
  Given than juan wants to learn automation at the academy choucair
  |strUser |strPassword|
  |tuUsuario|tuClave   |
When he search for the course
  |strCourse |
  |Metodologia Bancolombia  |
Then he finds the course called
  |strCourse |
  |Metodologia Bancolombia  |