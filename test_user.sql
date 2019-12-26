/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : test_user

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-12-26 16:08:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', '123456', '23', '1');
INSERT INTO `user` VALUES ('min', 'sdgmylove', '23', '2');
INSERT INTO `user` VALUES ('yt', '1996', '23', '3');
INSERT INTO `user` VALUES ('你好啊', '654321', '22', '4');
INSERT INTO `user` VALUES ('hello', '123456', '25', '5');
