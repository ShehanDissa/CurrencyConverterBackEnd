-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 29, 2024 at 01:40 PM
-- Server version: 8.0.35
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `currencyconverter`
--

-- --------------------------------------------------------

--
-- Table structure for table `exchange_rates`
--

DROP TABLE IF EXISTS `exchange_rates`;
CREATE TABLE IF NOT EXISTS `exchange_rates` (
  `id` int NOT NULL AUTO_INCREMENT,
  `from_currency` varchar(255) DEFAULT NULL,
  `rate` double DEFAULT NULL,
  `to_currency` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `exchange_rates`
--

INSERT INTO `exchange_rates` (`id`, `from_currency`, `rate`, `to_currency`) VALUES
(1, 'USD', 0.85, 'EUR'),
(2, 'USD', 0.73, 'GBP'),
(3, 'USD', 115.25, 'JPY'),
(5, 'EUR', 1.18, 'USD'),
(6, 'EUR', 0.86, 'GBP'),
(7, 'EUR', 129.2, 'JPY'),
(8, 'GBP', 1.37, 'USD'),
(9, 'GBP', 1.16, 'EUR'),
(10, 'GBP', 150.1, 'JPY'),
(11, 'JPY', 0.0087, 'USD'),
(12, 'JPY', 0.0077, 'EUR'),
(13, 'JPY', 0.0067, 'GBP'),
(14, 'LKR', 0.26, 'INR'),
(15, 'INR', 0.012, 'USD'),
(16, 'INR', 1.78, 'JPY'),
(17, 'EUR', 348.5, 'LKR'),
(18, 'LKR', 0.46, 'JPY'),
(19, 'INR', 0.011, 'EUR'),
(20, 'USD', 318.97, 'LKR'),
(21, 'USD', 83.1, 'INR'),
(22, 'EUR', 90.56, 'INR'),
(23, 'GBP', 406.08, 'LKR'),
(24, 'GBP', 105.78, 'INR'),
(25, 'JPY', 0.56, 'INR'),
(26, 'JPY', 2.16, 'LKR'),
(27, 'LKR', 0.0025, 'GBP'),
(28, 'LKR', 0.0031, 'USD'),
(29, 'LKR', 0.0029, 'EUR'),
(30, 'INR', 0.0095, 'GBP'),
(31, 'INR', 3.84, 'LKR'),
(32, 'USD', 1, 'USD'),
(33, 'EUR', 1, 'EUR'),
(34, 'LKR', 1, 'LKR'),
(35, 'INR ', 1, 'INR'),
(36, 'JPY', 1, 'JPY'),
(37, 'GBP', 1, 'GBP');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
