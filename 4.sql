/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.28 : Database - curriculum_user_curriculum
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`curriculum_user_curriculum` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `curriculum_user_curriculum`;

/*Table structure for table `chapter` */

DROP TABLE IF EXISTS `chapter`;

CREATE TABLE `chapter` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `curriculumId` int(11) DEFAULT NULL COMMENT '主课id',
  `chapterName` varchar(500) DEFAULT NULL COMMENT '章节名称',
  `introduce` varchar(500) DEFAULT NULL COMMENT '章节介绍',
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `chapter` */

/*Table structure for table `directiontype` */

DROP TABLE IF EXISTS `directiontype`;

CREATE TABLE `directiontype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `directionName` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '方向名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `directiontype` */

/*Table structure for table `ificationtype` */

DROP TABLE IF EXISTS `ificationtype`;

CREATE TABLE `ificationtype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `typeName` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '分类名称',
  `directionId` bigint(20) DEFAULT NULL COMMENT '分类所属方向',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `ificationtype` */

/*Table structure for table `maincurriculum` */

DROP TABLE IF EXISTS `maincurriculum`;

CREATE TABLE `maincurriculum` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `courseName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '课程名称',
  `courseTypes` int(11) DEFAULT NULL COMMENT '课程类型',
  `hierarchicalType` int(11) DEFAULT NULL COMMENT '难度等级',
  `introduction` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '课程介绍',
  `chapters` int(11) DEFAULT NULL COMMENT '课程章节',
  `duration` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '时长',
  `stuNumber` int(11) DEFAULT NULL COMMENT '学习人数',
  `courseNotes` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '课程须知',
  `whattoLearn` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '能学到什么',
  `money` decimal(10,0) DEFAULT NULL COMMENT '价格',
  `image` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '课程图片',
  `teacherId` int(11) DEFAULT NULL COMMENT '教师id',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `maincurriculum` */

/*Table structure for table `second` */

DROP TABLE IF EXISTS `second`;

CREATE TABLE `second` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `chapterId` int(11) DEFAULT NULL COMMENT '章节id',
  `secondName` varchar(500) DEFAULT NULL COMMENT '次课程名称',
  `video` varchar(500) DEFAULT NULL COMMENT '视频',
  `status` int(1) DEFAULT NULL COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `second` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
