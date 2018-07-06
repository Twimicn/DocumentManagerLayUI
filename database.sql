CREATE TABLE `user` (
  `uid` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `role` int(11) NOT NULL DEFAULT '0',
  `status` int NOT NULL DEFAULT '0',
  `name` varchar(32) NOT NULL,
  `sex` varchar(4) NOT NULL,
  `birthday` text NOT NULL,
  `address` text,
  `contact` text NOT NULL,
  `referrer` text,
  `industryid` int(11) NOT NULL,
  `committeeid` int(11) NOT NULL,
  PRIMARY KEY (`uid`)
);

CREATE TABLE `userinfo` (
  `uid` int(20) NOT NULL,
  `company` text,
  `title` text,
  `position` text,
  `phone` text,
  `email` text,
  `wechat` text,
  PRIMARY KEY (`uid`)
);

CREATE TABLE `proposal` (
  `pid` int(20) NOT NULL AUTO_INCREMENT,
  `author` int(11) NOT NULL,
  `name` text NOT NULL,
  `content` text NOT NULL,
  `timeline` int(11) NOT NULL,
  `deadline` int(11) NOT NULL,
  `status` int(11) DEFAULT '0',
  `support` int(11) DEFAULT '0',
  `reject` int(11) DEFAULT '0',
  PRIMARY KEY (`pid`)
);

CREATE TABLE `pcomment` (
  `cid` int(20) NOT NULL AUTO_INCREMENT,
  `pid` int(20) NOT NULL,
  `uid` int(20) NOT NULL,
  `content` text NOT NULL,
  `timeline` int(11) NOT NULL,
  PRIMARY KEY (`cid`)
);