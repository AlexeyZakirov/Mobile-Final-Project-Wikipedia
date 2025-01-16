# Проект по автоматизации тестирования мобильного приложения [Wikipedia](https://ru.wikipedia.org/)

<a href="https://ru.wikipedia.org/"><img src="media\screenshots\logo.png" width="850" alt="Wiki"/></a>
---
##  **Содержание:**

---

* [Технологии и инструменты](#технологии-и-инструменты)
* [Реализованные автоматизированные тесты](#реализованные-автоматизированные-тесты)
* [Запуск тестов - сборка в Jenkins](#запуск-тестов---сборка-в-jenkins)
* [Запуск тестов - локальный](#запуск-тестов---локальный)
* [Allure Report](#allure-report)
* [Allure TestOps](#allure-testops)
* [Jira](#jira)
* [Уведомление в Telegram о результатах тестов](#уведомление-в-telegram-о-результатах-тестов)
* [Пример видео выполнения теста в Browserstack](#пример-видео-выполнения-теста-в-Browserstack)

## Технологии и инструменты:

---


<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="media/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="media/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://github.com/allure-framework/"><img src="media/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
</p>

---

## Реализованные автоматизированные тесты:

---

- *Проверка соответствия всех экранов онбординга*
- *Проверка перехода по экранам посредством навигации*
- *Попытка авторизации с некорректными данными*
- *Создание reading list*

---

## Запуск тестов - сборка в [Jenkins](https://jenkins.autotests.cloud/job/30-tinwhip-MOBILE_FINAL_PROJECT/):

---

<p align="center">  
<img title="Jenkins" src="media\screenshots\Jenkins.png" width="850">  
</p> 

***Запуск через Jenkins производится посредством Browserstack. Для запуска тестов необходимо кликнуть 'Build with Parameters' и выбрать testType***

***Ключ testType позволяет запустить тесты с конкретным тэгом, либо выбор всех тестов для запуска:***
- *test - запускает все тесты*
- *onboarding_test - запускает тесты на онбординг*
- *navigation_test - запускает тесты на навигацию*
- *login_test - запускает тесты на логин*
- *readingList_test - запускает тесты на reading list*

## Запуск тестов - локальный
___
Для локального запуска необходимо сконфигурировать файлы .properties (для browserstack требуется создание auth.properties)

***Локальный запуск (вместо test можно выбрать другой ключ, см. пункт выше):***
- *-DdeviceHost=browserstack - запускает тесты удаленно посредством Browserstack*
- *-DdeviceHost=emulator - запускает тесты через эмулятор, предварительно включенный локально*
- *-DdeviceHost=real - запускает тесты через реальное устройство, подключенное локально*

***Пример команды запуска:***
```  
gradle clean test -DdeviceHost=browserstack
```
*Также реализован запуск отдельного теста внутри IDE, посредством запуска через зелёный треугольник*

---
## [Allure Report](https://jenkins.autotests.cloud/job/30-tinwhip-MOBILE_FINAL_PROJECT/allure/)

---

## Основная страница отчёта
***С инфомацией о количестве запущенных тестов, статусе прохождения и графика TREND, отображающего тенденцию прогона тестов***

<p align="center">  
<img title="Allure Report" src="media\screenshots\Allure Report.png" width="850">  
</p>  

## Тест-кейсы.
***Содержат подробное описание шагов со скриншотами, видео и Page Source по каждому тесту***

<p align="center">  
<img title="Allure Tests" src="media\screenshots\AllureTests.png" width="850">  
</p> 


---
## [Allure TestOps](https://allure.autotests.cloud/project/4566/test-cases?treeId=0)

---

## Реализована интеграция с Allure TestOps

<p align="center">  
<img title="Allure TestOps" src="media\screenshots\AllureTestOps.png" width="850">  
</p>  

---
## [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1384)

---

## Реализована интеграция с Jira

<p align="center">  
<img title="Jira" src="media\screenshots\Jira.png" width="850">  
</p>  

---

## Уведомление в Telegram о результатах тестов
____

<p align="center">  
<img title="Telegram" src="media\screenshots\Telegram.png" width="850">  
</p>

____

## Пример видео выполнения теста в Browserstack
____
<p align="center">
<img title="Selenoid Video" src="media/screenshots/video.gif" width="352" height="764"  alt="video">   
</p>