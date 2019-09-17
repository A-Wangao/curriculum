/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.28 : Database - curriculum_user_integral
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`curriculum_user_integral` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `curriculum_user_integral`;

/*Table structure for table `coupon` */

DROP TABLE IF EXISTS `coupon`;

CREATE TABLE `coupon` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(20) DEFAULT NULL COMMENT '用户',
  `money` int(11) DEFAULT NULL COMMENT '金额(50积分：15元 100积分：30元 150积分：50元)',
  `maturitytime` datetime DEFAULT NULL COMMENT '到期时间',
  `state` int(11) DEFAULT '1' COMMENT '状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `coupon` */

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `orderId` bigint(20) DEFAULT NULL COMMENT '订单编号',
  `createTime` datetime DEFAULT NULL COMMENT '订单时间',
  `curriculumId` bigint(20) DEFAULT NULL COMMENT '课程',
  `status` bigint(11) DEFAULT NULL COMMENT '订单状态',
  `couponId` int(11) DEFAULT '0' COMMENT '优惠券',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `goods` */

insert  into `goods`(`id`,`orderId`,`createTime`,`curriculumId`,`status`,`couponId`) values (1,1,'2019-09-16 15:50:19',1,1,0);

/*Table structure for table `integral` */

DROP TABLE IF EXISTS `integral`;

CREATE TABLE `integral` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userId` bigint(20) DEFAULT NULL COMMENT '用户',
  `userintegral` int(11) DEFAULT NULL COMMENT '用户积分',
  `access` int(11) DEFAULT NULL COMMENT '获取途径(0：活动1：充钱2：正常)',
  `getdate` datetime DEFAULT NULL COMMENT '获取日期',
  `usedate` datetime DEFAULT NULL COMMENT '使用日期',
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `integral` */

insert  into `integral`(`id`,`userId`,`userintegral`,`access`,`getdate`,`usedate`,`status`,`createTime`) values (1,1,1,1,'2019-09-11 16:51:40','2019-09-11 16:51:42',1,NULL);

/*Table structure for table `integralmall` */

DROP TABLE IF EXISTS `integralmall`;

CREATE TABLE `integralmall` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `money` decimal(10,0) DEFAULT NULL,
  `integral` varchar(50) DEFAULT NULL,
  `term` datetime DEFAULT NULL,
  `images` varchar(1000) DEFAULT NULL,
  `status` int(11) DEFAULT '1' COMMENT '数据状态',
  `createTime` datetime DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `integralmall` */

insert  into `integralmall`(`id`,`name`,`money`,`integral`,`term`,`images`,`status`,`createTime`) values (1,'1','1','1','2019-09-12 08:44:41','1',1,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
