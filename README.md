## Описание проекта

Text Quest: Урок зельеварения в Хогвартсе — это текстовый квест, в котором игроки влияют на разработку своего приключения в школе магии. 
Каждый шаг игрока зависит от предыдущих выборов, что создает интерактивный и увлекательный опыт. 
В этой игре вам предстоит создать персонажа, подготовиться к уроку зельеварения и отвечать на вопросы профессора. Каждое ваше решение может привести к победе или поражению!

## Как работает проект

- Игроки начинают игру с приветственной страницы и имеют возможность создать своего персонажа или выбрать одного из предложенных.
- В процессе игры игроки принимают решения, которые изменяют ход событий. Например, они могут выбрать, общаться ли с одноклассниками или готовиться к уроку.
- Во время урока зельеварения игрок должен правильно отвечать на вопросы профессора. Неправильные ответы могут привести к выговору и окончанию игры.
- В зависимости от принятых решений, игроки могут выиграть или проиграть, с последующим предложением начать игру снова.

## Используемые технологии

- Java: Основной язык программирования.
- Maven: Инструмент для управления зависимостями и сборки проекта.
- Servlets: Для обработки запросов и ответов.
- JSP (JavaServer Pages): Для создания динамического веб-контента.
- JSTL (JavaServer Pages Standard Tag Library): Упрощает разработку JSP-страниц.
- JUnit: Для юнит-тестирования логики игры.
- Apache Tomcat 10: Веб-сервер, используемый для запуска приложения.

## Как запустить проект

1. Клонируйте репозиторий:

   git clone [https://github.com/yourusername/hogwarts-potions-quest.git](https://github.com/BlackFireMK/TextQuest.git)
   
   cd hogwarts-potions-quest

3. Соберите проект:
   Убедитесь, что у вас установлен Maven, затем выполните команду:

   mvn clean install

4. Запустите на Tomcat:
   - Разверните WAR файл в папке webapps вашего сервера Tomcat.
   - Запустите Tomcat и перейдите по следующему адресу в браузере: http://localhost:8080/hogwarts-potions-quest.

Теперь вы готовы погрузиться в увлекательный мир зельеварения в Хогвартсе! Удачи!

---

## Project Description

Text Quest: Hogwarts Potions Class is a text-based quest where players influence the course of their adventure at the school of magic.
Each step of the game depends on previous choices, creating an interactive and engaging experience. 
In this game, you will create a character, prepare for a potions class, and answer the professor's questions. Your decisions can lead to victory or defeat!

## How the Project Works

- Players start the game from a welcome page and can either create their character or choose one from a list.
- Throughout the game, players make decisions that change the course of events. For example, they may choose to socialize with classmates or prepare for the lesson.
- During the potions lesson, players must answer the professor's questions correctly. Incorrect answers may lead to failure and the end of the game.
- Depending on the choices made, players can either win or lose, with the option to restart the game afterward.

## Technologies Used

- Java: The main programming language.
- Maven: A tool for managing dependencies and building the project.
- Servlets: For handling request and response cycles.
- JSP (JavaServer Pages): For creating dynamic web content.
- JSTL (JavaServer Pages Standard Tag Library): Simplifies JSP page development.
- JUnit: For unit testing the game logic.
- Apache Tomcat 10: The web server used for running the application.

## How to Run the Project

1. Clone the Repository:

   git clone [https://github.com/yourusername/hogwarts-potions-quest.git](https://github.com/BlackFireMK/TextQuest.git)
   
   cd hogwarts-potions-quest


3. **Build the Project**:
   Ensure that Maven is installed, then run:
   ```bash
   mvn clean install

4. Run on Tomcat:
   - Deploy the WAR file to the webapps folder of your Tomcat server.
   - Start Tomcat and navigate to http://localhost:8080/hogwarts-potions-quest in your web browser.

You are now ready to immerse yourself in the enchanting world of potions at Hogwarts! Good luck!
