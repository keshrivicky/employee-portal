<html>
<body>
<h2>CREATE DATABASE `employee`</h2>
<h2>CREATE TABLE `employee_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) NOT NULL,
  `emp_id` varchar(45) NOT NULL,
  `emp_dept` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
)</h2>

<h2>CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
)</h2>
</body>
</html>
