-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 11, 2021 at 01:28 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tikam`
--

-- --------------------------------------------------------

--
-- Table structure for table `dlogin`
--

CREATE TABLE `dlogin` (
  `nama` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telp` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dlogin`
--

INSERT INTO `dlogin` (`nama`, `email`, `telp`) VALUES
('ambollang', 'am@gmail.com', 21032),
('ambollang', 'ambollang@gmail.crot', 812121);

-- --------------------------------------------------------

--
-- Table structure for table `harga`
--

CREATE TABLE `harga` (
  `id` int(11) NOT NULL,
  `status` varchar(50) NOT NULL,
  `kelas` varchar(20) NOT NULL,
  `harga` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `harga`
--

INSERT INTO `harga` (`id`, `status`, `kelas`, `harga`) VALUES
(1, 'dewasa', 'eksekutif', '50000'),
(2, 'anak', 'eksekutif', '25000'),
(3, 'dewasa', 'ekonomi', '30000'),
(4, 'anak', 'ekonomi', '15000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('albonas', 'anjing'),
('ambo', 'babi'),
('amboll', 'huting'),
('amboll43', 'huting'),
('ambollang', 'anjing'),
('asdasd', 'asdasd'),
('dasasd', 'dasdasd'),
('mamm', 'january2001'),
('martin', 'january2001');

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `id` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `awal` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `berangkat` varchar(50) NOT NULL,
  `tiba` varchar(50) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `kapal` varchar(50) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `dewasa` varchar(50) NOT NULL,
  `anak` varchar(50) NOT NULL,
  `total` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`id`, `nama`, `alamat`, `awal`, `tujuan`, `berangkat`, `tiba`, `tanggal`, `kapal`, `kelas`, `dewasa`, `anak`, `total`) VALUES
('MR.1', 'Martin', 'Nainggolan', 'Samosir (SMR)', 'Surabaya Gubeng (SGU)', '08.30 WIB', '20.19 WITA', 'Sun Jul 11 17:56:54 ICT 2021', 'Argo Wilis', 'Eksekutif 2', '2', '2', 'Rp. 150000'),
('MR.2', 'xman', 'api naroko', 'Samosir (SMR)', 'Solo Balapan (SLO)', '09.20 WIB', '18.15 WITA', 'Sun Jul 11 18:17:02 ICT 2021', 'Argo Parahyangan', 'Eksekutif 2', '1', '0', 'Rp. 50000');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `jurusan` varchar(50) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `harga`
--
ALTER TABLE `harga`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`jurusan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `harga`
--
ALTER TABLE `harga`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
