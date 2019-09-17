/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.28 : Database - curriculum_user_consumption
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`curriculum_user_consumption` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `curriculum_user_consumption`;

/*Table structure for table `expenditure` */

DROP TABLE IF EXISTS `expenditure`;

CREATE TABLE `expenditure` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(20) DEFAULT NULL COMMENT '用户',
  `expenditure` decimal(10,0) DEFAULT NULL COMMENT '支出',
  `zhichuTime` datetime DEFAULT NULL COMMENT '支出时间',
  `remarks` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `paychannel` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '途径(钱花在什么上面了)',
  `method` int(11) DEFAULT NULL COMMENT '支付方式(1:支付宝2：余额3：积分)',
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `expenditure` */

/*Table structure for table `income` */

DROP TABLE IF EXISTS `income`;

CREATE TABLE `income` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(20) DEFAULT NULL COMMENT '用户',
  `income` decimal(10,0) DEFAULT NULL COMMENT '收入',
  `shourutime` datetime DEFAULT NULL COMMENT '收入时间',
  `remarks` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `inchannel` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '收入途径',
  `Intype` int(11) DEFAULT NULL COMMENT '充值类型(1获取的积分2充值的余额)',
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `income` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
