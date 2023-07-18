-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-07-2023 a las 21:02:58
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `impro_ats`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conversacion`
--

CREATE TABLE `conversacion` (
  `id` int(11) NOT NULL,
  `puerto` text NOT NULL,
  `usuario` text NOT NULL,
  `mensaje` text NOT NULL,
  `fecha_hora` text NOT NULL,
  `puertoDirigido` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `conversacion`
--

INSERT INTO `conversacion` (`id`, `puerto`, `usuario`, `mensaje`, `fecha_hora`, `puertoDirigido`) VALUES
(17, '5001', 'Benjamin Justo', 'hola', '17/07/2023, 12:48PM', '5003'),
(18, '5003', 'Carlos', 'hola', '17/07/2023, 12:57PM', '5001'),
(19, '5001', 'Benjamin Atoche', 'Como estas Soley?', '17/07/2023, 01:00PM', '5002'),
(20, '5001', 'Benjamin Atoche', 'en donde estas?', '17/07/2023, 01:01PM', '5003'),
(21, '5003', 'Carlos Saavedra', 'hablando conmigo', '17/07/2023, 01:02PM', '5003');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `id` int(11) NOT NULL,
  `codigo` text NOT NULL,
  `nombre` text NOT NULL,
  `stock` text NOT NULL,
  `precio` text NOT NULL,
  `categoria` text NOT NULL,
  `marca` text NOT NULL,
  `url_imagen` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sedes`
--

CREATE TABLE `sedes` (
  `sede` int(11) NOT NULL,
  `ubicacion` text NOT NULL,
  `fechaApertura` text NOT NULL,
  `estado` text NOT NULL,
  `trabajadores` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajadores`
--

CREATE TABLE `trabajadores` (
  `id` int(11) NOT NULL,
  `dni` text NOT NULL,
  `contraseña` text NOT NULL,
  `nombres` text NOT NULL,
  `apellidos` text NOT NULL,
  `edad` text NOT NULL,
  `genero` text NOT NULL,
  `correo` text NOT NULL,
  `cargo` text NOT NULL,
  `Codigo` text NOT NULL,
  `sede` text NOT NULL,
  `puerto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `trabajadores`
--

INSERT INTO `trabajadores` (`id`, `dni`, `contraseña`, `nombres`, `apellidos`, `edad`, `genero`, `correo`, `cargo`, `Codigo`, `sede`, `puerto`) VALUES
(1, '71936801', '123', 'Benjamin Justo', 'Atoche Lopez', '18', 'M', 'atochelopezb@gmail.com', 'Administrador', 'TR03BENAT2371', '3', '5001'),
(2, '72839214', '123', 'Soley Aracely', 'Rios Zegarra', '21', 'F', 'aracelyRios@gmail.com', 'Trabajador', 'TR03SOLRI2372', '3', '5002'),
(3, '48392343', '123', 'Carlos', 'Saavedra Tapullima', '19', 'M', 'carlossaavedra@gmail.com', 'Trabajador', 'TR02CARSA2348', '2', '5003'),
(4, '47198921', '123', 'Katherine Lizeth', 'Ante Orejuela', '23', 'F', 'katherineante@gmail.com', 'Trabajador', 'TR06KATAN2347', '6', '5004'),
(5, '46372199', '123', 'Maria Nesle', 'Peralta Albarran', '19', 'F', 'marianesle@gmail.com', 'Trabajador', 'TR03MARPE2346', '3', '5005');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `conversacion`
--
ALTER TABLE `conversacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `sedes`
--
ALTER TABLE `sedes`
  ADD PRIMARY KEY (`sede`);

--
-- Indices de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `conversacion`
--
ALTER TABLE `conversacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sedes`
--
ALTER TABLE `sedes`
  MODIFY `sede` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
