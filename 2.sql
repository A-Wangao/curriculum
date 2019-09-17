/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.28 : Database - curriculum_user_comment
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`curriculum_user_comment` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `curriculum_user_comment`;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `issueId` bigint(20) DEFAULT NULL COMMENT '笔记人',
  `userId` bigint(20) DEFAULT NULL COMMENT '回复人',
  `replyMsg` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '评论内容',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `zannumber` int(11) DEFAULT NULL COMMENT '赞数',
  `secondId` int(11) DEFAULT NULL COMMENT '次课程id',
  `state` int(11) DEFAULT '1' COMMENT '数据状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `comment` */

/*Table structure for table `note` */

DROP TABLE IF EXISTS `note`;

CREATE TABLE `note` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` int(11) DEFAULT NULL COMMENT '用户id',
  `mainId` int(11) DEFAULT NULL COMMENT '主课程id',
  `secondId` int(11) DEFAULT NULL COMMENT '次课程id',
  `noteContent` varchar(500) DEFAULT NULL COMMENT '笔记内容',
  `status` int(11) DEFAULT NULL COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `note` */

/*Table structure for table `reply` */

DROP TABLE IF EXISTS `reply`;

CREATE TABLE `reply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `commentId` bigint(20) DEFAULT NULL COMMENT '评论Id',
  `fromuserId` bigint(20) DEFAULT NULL COMMENT '回复人',
  `touserId` bigint(20) DEFAULT NULL COMMENT '回复对象',
  `replyMsg` varchar(2000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '回复内容',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT NULL COMMENT '数据状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `reply` */

/*Table structure for table `usercurriculum` */

DROP TABLE IF EXISTS `usercurriculum`;

CREATE TABLE `usercurriculum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(20) DEFAULT NULL COMMENT '用户Id',
  `curriculum` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户学的哪个课程',
  `startTime` datetime DEFAULT NULL COMMENT '开始学习时间',
  `scheduled` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '已学进度',
  `userTime` datetime DEFAULT NULL COMMENT '用时时间',
  `learn` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '已学到课程',
  `note` varchar(2000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '笔记',
  `code` varchar(2000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '代码',
  `question` varchar(2000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '问答',
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  `collection` int(11) DEFAULT '0' COMMENT '收藏',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `usercurriculum` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
