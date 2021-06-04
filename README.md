# Monitpr_Sensor
Создаю проект Maven. Добавляю dependency в pom.xml-файл.
 Создаю файл applicationContext.xml, в котором прописываю bean. 
 Создаю класс Sensor, который является Entity, для связи с таблицой в БД. 
Создаю интрефейс SensorDao и класс SensorDaoEmp, его имплементирующий. Здесь прописываю запросы к БД.
Создаю интерфейс ServiceSensor и класс ServiceSensorImpl, его имплементирующий. Это посредник между MyController и DAO.
Создаю MyController и jsp-страницы.
Для реализации авторизации и аутентификации создаю MySecurityConfig и MySecurityInitializer. 

CREATE TABLE sensor (
  id INT(10) NOT NULL AUTO_INCREMENT,
  name VARCHAR(15) NOT NULL,
  model VARCHAR(20)NOT NULL,
  type VARCHAR(20) NOT NULL,
  ranges VARCHAR(10),
  unit VARCHAR(20) NOT NULL,
  location VARCHAR(20),
  descriprion VARCHAR(200),
  PRIMARY KEY (ID)
) ;

INSERT INTO SENSOR (NAME, MODEL, TYPE, RANGES,UNIT,LOCATION , DESCRIPTION) VALUES ('SENSOR1', 'PC33-56', 'PRESSURE', '0-16', 'BAR', 'ROOM1', 'model1');
INSERT INTO SENSOR (NAME, MODEL, TYPE, RANGES,UNIT,LOCATION, DESCRIPTION) VALUES ('SENSOR2', 'EH-567', 'VOLTAGE', '-25-25', 'VOLTAGE', 'ROOM1', 'model2');


CREATE TABLE users(
  username varchar(15),
  password varchar(100),
  enabled tinyint(1),
  PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
  username varchar(15),
  authority varchar(25),
  FOREIGN KEY (username) references users(username)
) ;


	
	INSERT INTO users (username, password, enabled)
VALUES
	('Olga', '{bcrypt}$2y$12$kwMgHG9hpJTBPjAf9xHbK.MBPRa4xT9wtaOQtB.T6HkXg0mxPuCM6 ', 1),
	('Elena', '{bcrypt}$2y$12$ETv0aQhgS3KdJUpY1zF8iu.iegSYHoX9Kc.28tr6JKGNpS6s0R/ny ', 1),
	('Ivan', '{bcrypt}$2y$12$xcee2.nTS7cK/7dcACBij.EnY8HmxExAzoeYbrY2/4hzj6LMACIoa ', 1),
	('Mikhail', '{bcrypt}$2y$12$p2KVzt8fn0npr10JYub9ZunPZ9Xoz/EhFOwxm9ndfEZBwH3hQ301S ', 1);
	
	INSERT INTO authorities (username, authority)
VALUES
	('Olga', 'ROLE_ADMINISTRATOR'),
	('Elena', 'ROLE_VIEWER'),
    ('Ivan', 'ROLE_ADMINISTRATOR'),
	('Mikhail', 'ROLE_VIEWER');
	
