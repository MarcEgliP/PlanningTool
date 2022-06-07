CREATE USER IF NOT EXISTS 'admin_planning'@'localhost' IDENTIFIED BY 'W3Ar3Th3B3stAndFuckTh3R3st*01';
CREATE DATABASE IF NOT EXISTS PLANNING_TOOL;
GRANT ALL PRIVILEGES ON `planning_tool`.* TO 'admin_planning'@'localhost';
