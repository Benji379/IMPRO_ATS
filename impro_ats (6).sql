-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-07-2023 a las 11:52:31
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
-- Estructura de tabla para la tabla `inventario_sede_1`
--

CREATE TABLE `inventario_sede_1` (
  `id` int(11) NOT NULL,
  `codigo` text DEFAULT NULL,
  `nombre` text DEFAULT NULL,
  `stock` text DEFAULT NULL,
  `precio` text DEFAULT NULL,
  `categoria` text DEFAULT NULL,
  `marca` text DEFAULT NULL,
  `urlImagen` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario_sede_2`
--

CREATE TABLE `inventario_sede_2` (
  `id` int(11) NOT NULL,
  `codigo` text DEFAULT NULL,
  `nombre` text DEFAULT NULL,
  `stock` text DEFAULT NULL,
  `precio` text DEFAULT NULL,
  `categoria` text DEFAULT NULL,
  `marca` text DEFAULT NULL,
  `urlImagen` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario_sede_3`
--

CREATE TABLE `inventario_sede_3` (
  `id` int(11) NOT NULL,
  `codigo` text DEFAULT NULL,
  `nombre` text DEFAULT NULL,
  `stock` text DEFAULT NULL,
  `precio` text DEFAULT NULL,
  `categoria` text DEFAULT NULL,
  `marca` text DEFAULT NULL,
  `urlImagen` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `inventario_sede_3`
--

INSERT INTO `inventario_sede_3` (`id`, `codigo`, `nombre`, `stock`, `precio`, `categoria`, `marca`, `urlImagen`) VALUES
(1, '128129282991', 'Panetón D\'ONOFRIO CAJA', '18', '20.89', 'Alimentos envasados', 'Donofrio', 'https://www.canastasweb.com/wp-content/uploads/2019/08/donofrio-caja-900g.png'),
(2, '2718292829', 'Pantalones Jean Clásico De Caballero', '12', '70.00', 'Cuidado de la ropa', 'Louis Vuitton', 'https://ae01.alicdn.com/kf/H1778853a4e2441ecb847f1110f34d2dcm.jpg?width=800&height=800&hash=1600'),
(3, '1212781282', 'Galletas de Soda SAN JORGE', '2', '1.50', 'Alimentos envasados', 'San Jorge', 'https://plazavea.vteximg.com.br/arquivos/ids/25835356-450-450/502139.jpg?v=638132704405000000'),
(4, '2718102929', 'Coca cola 3 litros', '2', '12.50', 'Alimentos envasados', 'Coca-Cola Company', 'https://images.rappi.pe/products/c29a8a2b-1109-408e-84d1-2ddf200354fb.jpg'),
(5, '2132389239', 'Helado PEZIDURI Chocochip 930ml', '17', '9.00', 'Alimentos envasados', 'Donofrio', 'https://tiendanestle.pe/cdn/shop/products/12452762_1.jpg?v=1665545787'),
(6, '127812819', 'GORRA ESCUDO GASTRONÓMICO B/R', '8', '69.90', 'Alimentos envasados', 'B/R', 'https://www.jeremykilimajer.com/cdn/shop/products/GORRAGASTROROJO_600x.jpg?v=1671057844'),
(7, '01871818272', 'Cuaderno Junior Book Cuadriculado Marco Rojo A4 Grapado x 80 Hojas Standford - Utilex', '6', '8.00', 'Alimentos envasados', 'Stanfort', 'https://images.utilex.pe/098274/450x450/cuaderno-junior-book-rayado-marco-rojo-a4-grapado-x-80-hojas-naranja-CYJSQGUTZ6DB4.jpeg'),
(8, '01928291', 'Galleta Animalito', '3', '1.50', 'Alimentos envasados', 'San jorge', 'https://vegaperu.vtexassets.com/arquivos/ids/159463/7750106000024.jpg?v=637835638542230000'),
(9, '2178211271', 'Aceite vegetal', '4', '7.80', 'Alimentos envasados', 'Tottus', 'https://s7d2.scene7.com/is/image/TottusPE/42842306_1?wid=240&hei=240&qlt=70&fmt=webp');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sedes`
--

CREATE TABLE `sedes` (
  `sede` int(11) NOT NULL,
  `ubicacion` text NOT NULL,
  `fechaApertura` text NOT NULL,
  `estado` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `sedes`
--

INSERT INTO `sedes` (`sede`, `ubicacion`, `fechaApertura`, `estado`) VALUES
(1, 'Mz t.lt14 Av.Luis Felipe', '2023-07-22 02:00:19', 'Activo'),
(2, 'Mz h lt 45. Los olivos', '2023-07-22 03:04:29', 'Activo'),
(3, 'Mz. j, av Avancay', '2023-07-22 03:28:47', 'Activo');

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
(1, '71936801', '123', 'Benjamin Justo', 'Atoche Lopez', '18', 'M', 'atochelopezb@gmail.com', 'Administrador', 'AD00BENAT2371', '1', '5001'),
(2, '72839214', '123', 'Soley Aracely', 'Rios Zegarra', '21', 'F', 'aracelyRios@gmail.com', 'Trabajador', 'TR01SOLRI2372', '1', '5002'),
(3, '48392343', '123', 'Carlos', 'Saavedra Tapullima', '19', 'M', 'carlossaavedra@gmail.com', 'Trabajador', 'TR03CARSA2348', '3', '5003'),
(4, '47198921', '123', 'Katherine Lizeth', 'Ante Orejuela', '23', 'F', 'katherineante@gmail.com', 'Trabajador', 'TR02KATAN2347', '2', '5004'),
(5, '46372199', '123', 'Maria Nesle', 'Peralta Albarran', '19', 'F', 'marianesle@gmail.com', 'Trabajador', 'TR03MARPE2346', '3', '5005'),
(6, '71828293', '123', 'Marco Antonio', 'Pardo Rivera', '19', 'M', 'antoniomarco@gmailcom', 'Trabajador', 'TR01MARPA2371', '2', '5006');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `sede` text NOT NULL,
  `dniTrabajador` text NOT NULL,
  `dniCliente` text NOT NULL,
  `productos` text NOT NULL,
  `total` text NOT NULL,
  `fecha` date NOT NULL,
  `hora` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `sede`, `dniTrabajador`, `dniCliente`, `productos`, `total`, `fecha`, `hora`) VALUES
(1, '3', '71936801', '71829321', '{\"total\":\"440.00\",\"productos\":[{\"precio\":\"9.00\",\"idProducto\":\"2132389239\",\"cantidad\":10},{\"precio\":\"70.00\",\"idProducto\":\"2718292829\",\"cantidad\":5}]}', '440.0', '2023-07-20', '01:18:50 AM'),
(2, '3', '71936801', '71820321', '{\"total\":\"112.90\",\"productos\":[{\"precio\":\"69.90\",\"idProducto\":\"127812819\",\"cantidad\":1},{\"precio\":\"9.00\",\"idProducto\":\"2132389239\",\"cantidad\":2},{\"precio\":\"12.50\",\"idProducto\":\"2718102929\",\"cantidad\":2}]}', '112.9', '2023-07-21', '03:01:12 AM'),
(3, '3', '71936801', '72839234', '{\"total\":\"189.80\",\"productos\":[{\"precio\":\"69.90\",\"idProducto\":\"127812819\",\"cantidad\":2},{\"precio\":\"12.50\",\"idProducto\":\"2718102929\",\"cantidad\":4}]}', '189.8', '2023-07-22', '07:30:16 AM'),
(4, '3', '71936801', '00000004', '{\"total\":\"25.00\",\"productos\":[{\"precio\":\"12.50\",\"idProducto\":\"2718102929\",\"cantidad\":2}]}', '25.0', '2023-07-23', '04:57:07 AM'),
(5, '3', '71936801', '48392012', '{\"total\":\"101.90\",\"productos\":[{\"precio\":\"8.00\",\"idProducto\":\"01871818272\",\"cantidad\":4},{\"precio\":\"69.90\",\"idProducto\":\"127812819\",\"cantidad\":1}]}', '101.9', '2023-07-24', '23:52:14 PM'),
(6, '3', '71936801', '71829321', '{\"total\":\"113.70\",\"productos\":[{\"precio\":\"1.50\",\"idProducto\":\"1212781282\",\"cantidad\":3},{\"precio\":\"7.80\",\"idProducto\":\"2178211271\",\"cantidad\":14}]}', '113.7', '2023-07-25', '00:23:51 AM');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `conversacion`
--
ALTER TABLE `conversacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `inventario_sede_1`
--
ALTER TABLE `inventario_sede_1`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `inventario_sede_2`
--
ALTER TABLE `inventario_sede_2`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `inventario_sede_3`
--
ALTER TABLE `inventario_sede_3`
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
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
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
-- AUTO_INCREMENT de la tabla `inventario_sede_1`
--
ALTER TABLE `inventario_sede_1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inventario_sede_2`
--
ALTER TABLE `inventario_sede_2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inventario_sede_3`
--
ALTER TABLE `inventario_sede_3`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `sedes`
--
ALTER TABLE `sedes`
  MODIFY `sede` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `trabajadores`
--
ALTER TABLE `trabajadores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
