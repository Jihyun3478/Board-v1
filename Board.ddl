CREATE TABLE `board` (
  `board_id` int NOT NULL AUTO_INCREMENT,
  `board_title` varchar(45) DEFAULT NULL,
  `board_writer` varchar(45) DEFAULT NULL,
  `board_content` varchar(225) DEFAULT NULL,
  `board_date` datetime DEFAULT NULL,
  PRIMARY KEY (`board_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
