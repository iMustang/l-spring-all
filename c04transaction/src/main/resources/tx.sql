DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) ,
  `money` decimal(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;
INSERT INTO `account` VALUES (1, 'xmustang', 400);
INSERT INTO `account` VALUES (2, 'horse', 9000);

create table student
(
    student_id    int            auto_increment,
    student_name  varchar(20)    not null,
    primary key(student_id)
);