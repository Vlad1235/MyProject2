CREATE SCHEMA  IF NOT EXISTS `supplier_directory`;

CREATE TABLE `suppliers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_website` varchar(45) DEFAULT NULL,
  `manager_name` varchar(45) DEFAULT NULL,
  `manager_email` varchar(45) DEFAULT NULL,
  `company_name` varchar(45) DEFAULT NULL,
  `product_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `suppliers` VALUES
	(1,'www.china-qiyuan.com','Daniel','sales3@china-qiyuan.com','Ningxia Qiyuan Pharmaceutical Co., Ltd','ascorbic acid'),
	(2,'www.chnattwr.cn','Lily','sales6@chinattwr.com','SHANDONG TONGTAI WEIRUN CHEMICAL CO.,LTD','Sodium Benzoate'),
	(3,'www.chinafooding.com','Lily','sales60@chinafooding.com','Fooding Group Limited','Creatine Monogydrate');