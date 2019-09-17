/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.28 : Database - curriculum_user
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`curriculum_user` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `curriculum_user`;

/*Table structure for table `administrator` */

DROP TABLE IF EXISTS `administrator`;

CREATE TABLE `administrator` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) COLLATE utf8_unicode_ci DEFAULT 'admin' COMMENT '账号',
  `password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `administrator` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `roleName` varchar(50) DEFAULT NULL COMMENT '角色名',
  `defaultFlag` int(11) DEFAULT NULL COMMENT '是否是默认角色',
  `deleteFlag` int(11) DEFAULT NULL COMMENT '是否删除',
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `teacherapply` */

DROP TABLE IF EXISTS `teacherapply`;

CREATE TABLE `teacherapply` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `realname` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `introduction` varchar(1000) DEFAULT NULL COMMENT '简介',
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacherapply` */

/*Table structure for table `userrole` */

DROP TABLE IF EXISTS `userrole`;

CREATE TABLE `userrole` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `roleId` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `userrole` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `phone` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号',
  `username` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '登录名',
  `password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '密码',
  `nickname` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '昵称',
  `headerimage` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '头像',
  `createtime` datetime DEFAULT NULL COMMENT '添加时间',
  `position` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '职位',
  `city` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '城市',
  `sex` int(11) DEFAULT NULL COMMENT '性别',
  `introduce` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '介绍',
  `sumstudytime` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '总学习时长',
  `follow` int(11) DEFAULT NULL COMMENT '关注Id',
  `peopleId` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '身份证',
  `realName` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '真实姓名',
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `users` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
