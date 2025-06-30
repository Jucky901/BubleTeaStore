/*M!999999\- enable the sandbox mode */ 
-- MariaDB dump 10.19  Distrib 10.11.11-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: Store
-- ------------------------------------------------------
-- Server version	10.11.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill_details`
--

DROP TABLE IF EXISTS `bill_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill_details` (
  `bill_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `unit_price` decimal(8,1) DEFAULT NULL,
  `total` decimal(10,1) DEFAULT NULL,
  PRIMARY KEY (`bill_id`,`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_details`
--

LOCK TABLES `bill_details` WRITE;
/*!40000 ALTER TABLE `bill_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bills`
--

DROP TABLE IF EXISTS `bills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `bills` (
  `bill_id` int(11) NOT NULL,
  `type_of_bill` varchar(15) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `isPaid` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`bill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bills`
--

LOCK TABLES `bills` WRITE;
/*!40000 ALTER TABLE `bills` DISABLE KEYS */;
/*!40000 ALTER TABLE `bills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `category_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES
(1,'Black Tea','Dark color and strong flavor'),
(2,'Green Tea','Green color and lighter flavor'),
(3,'Milk Tea','More sweet, easier to drink'),
(4,'Topping','Extra ingredient added on top');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `unit_of_measure` varchar(50) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES
(1,'Foam Black Tea (M)',1,'cup',7000.00,1),
(2,'Foam Black Tea (L)',1,'cup',12000.00,1),
(3,'Honey Black Tea (M)',1,'cup',15000.00,1),
(4,'Honey Black Tea (L)',1,'cup',20000.00,1),
(5,'Honey Lemon Tea (M)',1,'cup',17000.00,1),
(6,'Honey Lemon Tea (L)',1,'cup',22000.00,1),
(7,'Preserved Plum Tea (M)',1,'cup',17000.00,1),
(8,'Preserved Plum Tea (L)',1,'cup',22000.00,1),
(9,'Peach Tea (M)',1,'cup',17000.00,1),
(10,'Peach Tea (L)',1,'cup',22000.00,1),
(11,'Foam Green Tea (M)',1,'cup',7000.00,2),
(12,'Foam Green Tea (L)',1,'cup',12000.00,2),
(13,'Honey Green Tea (M)',1,'cup',15000.00,2),
(14,'Honey Green Tea (L)',1,'cup',20000.00,2),
(15,'Black Milk Tea (M)',1,'cup',12000.00,3),
(16,'Black Milk Tea (L)',1,'cup',17000.00,3),
(17,'Honey Black Milk Tea (M)',1,'cup',17000.00,3),
(18,'Honey Black Milk Tea (L)',1,'cup',22000.00,3),
(19,'Taro Milk Tea (M)',1,'cup',17000.00,3),
(20,'Taro Milk Tea (L)',1,'cup',22000.00,3),
(21,'Green Milk Tea (M)',1,'cup',12000.00,3),
(22,'Green Milk Tea (L)',1,'cup',17000.00,3),
(23,'Honey Green Milk Tea (M)',1,'cup',17000.00,3),
(24,'Honey Green Milk Tea (L)',1,'cup',22000.00,3),
(25,'Traditional Tapioca Pearl',1,'pieces',3000.00,4),
(26,'Cheese Ball (1 piece)',1,'pieces',3000.00,4),
(27,'Pomegranate Coconut Jelly',1,'pieces',5000.00,4),
(28,'Water Chestnut Jelly',1,'spoon',5000.00,4),
(29,'Pandan Cheese Jelly',1,'spoon',5000.00,4),
(30,'Raindrop Jelly',1,'spoon',5000.00,4),
(31,'Egg Milk Pudding',1,'pieces',5000.00,4),
(32,'Chocolate Pudding',1,'pieces',5000.00,4),
(33,'Crunchy Coconut Jelly',1,'spoon',5000.00,4),
(34,'Peach Jelly',1,'pieces',5000.00,4);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recipes`
--

DROP TABLE IF EXISTS `recipes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipes` (
  `recipe_id` int(11) NOT NULL,
  `item_id` int(11) DEFAULT NULL,
  `number_used` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `time_taken` int(11) DEFAULT NULL,
  `product_quantity` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`recipe_id`),
  KEY `item_id` (`item_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `recipes_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `storages` (`item_id`),
  CONSTRAINT `recipes_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipes`
--

LOCK TABLES `recipes` WRITE;
/*!40000 ALTER TABLE `recipes` DISABLE KEYS */;
/*!40000 ALTER TABLE `recipes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storages`
--

DROP TABLE IF EXISTS `storages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `storages` (
  `item_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `unit_of_measure` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storages`
--

LOCK TABLES `storages` WRITE;
/*!40000 ALTER TABLE `storages` DISABLE KEYS */;
INSERT INTO `storages` VALUES
(1,'Unfiltered black tea',100,'bag'),
(2,'Unfiltered green tea',100,'bag'),
(3,'Chocolate Power',100,'bag'),
(4,'Tapioca Pearl',100,'bag'),
(5,'White sugar',100,'bag'),
(6,'Milk Powder',100,'bag'),
(7,'Sugar Co Ba',100,'bag'),
(8,'Traditional Tapioca Pearl',100,'bag'),
(9,'Socola Pudding Powder',100,'bag'),
(10,'Taro Powder',100,'bag'),
(11,'Water Chestnut Jelly',100,'bag'),
(12,'Egg Milk Pudding Powder',100,'bag'),
(13,'Honey',100,'jar'),
(14,'Lemon',100,'fruit'),
(15,'Whipping Cream',100,'bag'),
(16,'Black Tapioca Pearl',100,'bag');
/*!40000 ALTER TABLE `storages` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-30 22:34:47
