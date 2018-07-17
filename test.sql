/*
Navicat MySQL Data Transfer

Source Server         : db
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-07-17 16:43:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `tid` int(5) NOT NULL AUTO_INCREMENT,
  `question` varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `opA` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `opB` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `opC` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `opD` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `answer` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('1', '如果一个方法或变量是\"private\"访问级别，那么它的访问范围是:', '在当前类，或者子类中', '在当前类或者它的父类中', '在当前类，或者它所有的父类中', '在当前类中', 'D');
INSERT INTO `question` VALUES ('2', '以下定义一维数组的语句中，正确的是：（）', 'int a [10]', 'int a []=new [10]', 'int  a[]\r\nint a []=new int [10]', 'int a []={1,2,3,4,5}', 'D');
INSERT INTO `question` VALUES ('3', '以下哪个不属于JVM堆内存中的区域（）？', 'survivor区', '常量池', 'eden区', 'old区', 'B');
INSERT INTO `question` VALUES ('4', '下面有关java实例变量,局部变量,类变量和final变量的说法，错误的是？', '实例变量指的是类中定义的变量，即成员变量，如果没有初始化，会有默认值。', '局部变量指的是在方法中定义的变量，如果没有初始化，会有默认值', '类变量指的是用static修饰的属性', 'final变量指的是用final 修饰的变量', 'B');
INSERT INTO `question` VALUES ('5', '下列不属于算法结构的是（）', '输入数据', '处理数据', '存储数据', '输出结果', 'C');
INSERT INTO `question` VALUES ('6', '以下说法错误的是（）', '虚拟机中没有泛型，只有普通类和普通方法', '所有泛型类的类型参数在编译时都会被擦除', '创建泛型对象时请指明类型，让编译器尽早的做参数检查', '泛型的类型擦除机制意味着不能在运行时动态获取List<T>中T的实际类型', 'D');
INSERT INTO `question` VALUES ('7', '以下哪项陈述是正确的？', '垃圾回收线程的优先级很高，以保证不再 使用的内存将被及时回收', '垃圾收集允许程序开发者明确指定释放 哪一个对象', '垃圾回收机制保证了JAVA程序不会出现 内存溢出', '以上都不对', 'D');
INSERT INTO `question` VALUES ('8', '下列关于继承的哪项叙述是正确的？ ', '在java中类允许多继承', '在java中一个类只能实现一个接口', '在java中一个类不能同时继承一个类和实现一个接口', 'java的单一继承使代码更可靠', 'D');
INSERT INTO `question` VALUES ('9', 'Java 中的集合类包括 ArrayList 、 LinkedList 、 HashMap 等，下列关于集合类描述错误的是？', 'ArrayList和LinkedList均实现了List接口', 'ArrayList访问速度比LinkedList快', '随机添加和删除元素时，ArrayList的表现更加快速', 'HashMap实现Map接口，它允许任何类型的键和值对象，并允许将NULL用作键或值', 'C');
INSERT INTO `question` VALUES ('10', 'Java中用正则表达式截取字符串中第一个出现的英文左括号之前的字符串。比如：北京市（海淀区）（朝阳区）（西城区），截取结果为：北京市。正则表达式为（）', '\".*?(?=\\\\()\"', '\".*?(?=\\()\"', '\".*(?=\\\\()\"', '\".*(?=\\()\"', 'A');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `score` double NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '??Sun Jul 15 16:50:25 CST 2018', '25', '2018-07-15');
INSERT INTO `student` VALUES ('2', 'testSun Jul 15 16:53:17 CST 2018', '0', '2018-07-15');
INSERT INTO `student` VALUES ('3', 'test@Sun Jul 15 16:57:20 CST 2018', '25', '2018-07-15');
INSERT INTO `student` VALUES ('4', 'test@Sun Jul 15 16:57:31 CST 2018', '0', '2018-07-15');
INSERT INTO `student` VALUES ('5', 'test@Sun Jul 15 16:57:41 CST 2018', '25', '2018-07-15');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '122', '111', '111', '111');
