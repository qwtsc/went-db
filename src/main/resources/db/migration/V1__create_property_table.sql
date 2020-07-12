DROP TABLE IF EXISTS `physical_property`;
CREATE TABLE `physical_property`  (
  `cas` varchar(60) NOT NULL PRIMARY KEY,
  `chinese_name` varchar(150) NOT NULL,
  `english_name` varchar(150) NOT NULL,
  `tb` double NULL DEFAULT NULL,
  `Tc` double NULL DEFAULT NULL,
  `pc` double NULL DEFAULT NULL,
  `Vc` double NULL DEFAULT NULL,
  `Zc` double NULL DEFAULT NULL,
  `w` double NULL DEFAULT NULL,
  `MW` double NULL DEFAULT NULL,
);