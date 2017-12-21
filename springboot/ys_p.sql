/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.0.96-community-nt : Database - ys_p
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ys_p` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ys_p`;

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` bigint(20) unsigned NOT NULL auto_increment,
  `roleName` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `username` varchar(20) default NULL,
  `account` varchar(40) NOT NULL COMMENT '账号',
  `nickName` varchar(40) NOT NULL COMMENT '昵称',
  `headIcon` varchar(100) default NULL,
  `sex` smallint(6) default '0' COMMENT '性别',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `status` smallint(6) NOT NULL default '0' COMMENT '账号状态：0.正常 -1.账号已删除 -2.账号被冻结',
  `lastLoginTime` int(11) NOT NULL COMMENT '最后登录时间',
  `registerTime` int(11) NOT NULL COMMENT '注册时间',
  `phone` varchar(11) default NULL COMMENT '手机',
  `email` varchar(30) default NULL COMMENT '邮箱',
  `weixin` varchar(20) default NULL COMMENT '微信',
  `qq` varchar(20) default NULL COMMENT 'qq',
  `alipay` varchar(20) default NULL COMMENT '支付宝',
  `realName` varchar(30) default NULL COMMENT '支付宝账号真实姓名',
  `roleId` bigint(20) default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `user_account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
