/*
Navicat MySQL Data Transfer

Source Server         : local_xampp
Source Server Version : 50505
Source Host           : localhost:3307
Source Database       : demoinscurso

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2023-01-29 11:37:03
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `curso`
-- ----------------------------
DROP TABLE IF EXISTS `curso`;
CREATE TABLE `curso` (
  `id_curso` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of curso
-- ----------------------------
INSERT INTO `curso` VALUES ('1', 'PHP', '700');
INSERT INTO `curso` VALUES ('2', 'JAVA', '1000');
INSERT INTO `curso` VALUES ('3', 'PYTHON', '1500');

-- ----------------------------
-- Table structure for `forma_pago`
-- ----------------------------
DROP TABLE IF EXISTS `forma_pago`;
CREATE TABLE `forma_pago` (
  `id_forma_pago` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `recargo` double DEFAULT NULL,
  PRIMARY KEY (`id_forma_pago`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of forma_pago
-- ----------------------------
INSERT INTO `forma_pago` VALUES ('1', 'Tarjeta Credito (1 Pago)', '100');
INSERT INTO `forma_pago` VALUES ('2', 'Tarjeta Credito (6 Pago)', '100');
INSERT INTO `forma_pago` VALUES ('3', 'Tarjeta Credito (12 Pago)', '100');

-- ----------------------------
-- Table structure for `inscripcion`
-- ----------------------------
DROP TABLE IF EXISTS `inscripcion`;
CREATE TABLE `inscripcion` (
  `id_insc` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `id_curso` int(11) DEFAULT NULL,
  `if_forma_pago` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_insc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of inscripcion
-- ----------------------------
INSERT INTO `inscripcion` VALUES ('0', 'aaa', '1111', '1', '1');
INSERT INTO `inscripcion` VALUES ('1', 'bbb', '111', '1', '1');
