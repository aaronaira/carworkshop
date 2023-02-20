drop database if exists carworkshop;
create database carworkshop;
use carworkshop;

create table login (
	email varchar(50) not null primary key,
    password varchar(50) not null
);

create table sesion (
	id int auto_increment not null primary key,
    dt_iniciosesion datetime not null,
    dt_finsesion datetime not null
);

create table cliente (
	id int auto_increment not null primary key,
    nombre varchar(50) not null,
    apellidos varchar(50) not null,
    dni varchar(50) not null,
    direccion varchar(50) not null,
    email varchar(50) not null,
    foreign key (email) references login(email)
);

create table tipo_vehiculo(
	id int auto_increment not null primary key,
    tipo enum("coche","moto","camion","furgoneta") not null default "coche"
);

create table vehiculo(
	id int auto_increment not null primary key,
    matricula varchar(50) not null,
    marca varchar(50) not null,
    modelo varchar(50) not null,
    v_year int not null,
    id_cliente int not null,
    tipo_vehiculo int not null,
    bastidor varchar(50),
    foreign key (id_cliente) references cliente(id),
    foreign key (tipo_vehiculo) references tipo_vehiculo(id)
);

## DIAGNOSTICO ANTES DE CITA
create table cabecera_diagnostico(
	id int auto_increment not null primary key,
    fecha_hora datetime not null,
    id_vehiculo int not null,
    foreign key (id_vehiculo) references vehiculo(id)
);

## tipo iva antes de diagnostico

create table tipo_iva(
	id int auto_increment not null primary key,
    valor float not null
);

create table linea_diagnostico(
	id_diagnostico int not null,
    n_linea int not null,
    descripcion varchar(50) not null,
    cantidad float not null,
    id_tipo_iva int not null,
    primary key (id_diagnostico, n_linea),
    foreign key (id_diagnostico) references cabecera_diagnostico(id),
    foreign key (id_tipo_iva) references tipo_iva(id) ## no está claro
);

create table totales_diagnostico(
	id int not null
    ## preguntar resto de atributos
);

create table pref_cliente(
	id_cliente int not null,
    dia varchar(50) not null,
    turno varchar(50) not null,
    fecha_hora datetime,
    primary key (id_cliente, fecha_hora),
    foreign key (id_cliente) references cliente(id)
);

create table cita(
	id int auto_increment not null primary key,
    fecha_hora datetime not null,
    id_vehiculo int not null,
    id_cliente int not null,
    id_diagnostico int not null,
    foreign key (id_vehiculo) references vehiculo(id),
    foreign key (id_cliente) references cliente(id),
    foreign key  (id_diagnostico) references cabecera_diagnostico(id)
);

create table empleado(
	id int auto_increment not null primary key
);

create table recepcion (
	id int auto_increment not null primary key,
    foto varchar(50) not null,
    fecha_hora datetime not null,
    id_vehiculo int not null,
    id_empleado_recepcion int not null,
    id_diagnostico_inicial int not null,
    id_diagnostico_recepcion int not null,
    foreign key(id_vehiculo) references vehiculo(id),
    foreign key (id_diagnostico_inicial) references cabecera_diagnostico(id),
    foreign key (id_diagnostico_recepcion) references cabecera_diagnostico(id),
    foreign key (id_empleado_recepcion) references empleado(id)
);
create table tarifa (
	id int auto_increment not null primary key,
    seccion varchar(50) not null,
    tipo_vehiculo int not null,
    precio float not null,
    foreign key (tipo_vehiculo) references tipo_vehiculo(id)
);

create table ot_cabecera (
	id int auto_increment not null primary key,
    fecha_hora datetime not null,
    id_vehiculo int not null,
    id_diagnostico int not null,
    foreign key (id_vehiculo) references vehiculo(id),
    foreign key (id_diagnostico) references cabecera_diagnostico(id)
);

create table piezas(
	id int auto_increment not null primary key,
    nombre varchar(50) not null
);

create table piezas_ot(
	id_ot int auto_increment not null,
    id_pieza int not null,
    cantidad int not null,
    primary key(id_ot, id_pieza),
    foreign key (id_ot) references ot_cabecera(id),
    foreign key (id_pieza) references piezas(id)
);

create table manoobra_ot (
	id int auto_increment not null,
    id_ot int not null,
    tarifa int not null,
    operacion varchar(50) not null,
    ts_inicio datetime not null,
    ts_fin datetime not null,
    primary key(id, id_ot),
    foreign key (id_ot) references ot_cabecera(id),
    foreign key (tarifa) references tarifa(id)
);

create table ot_totales(
	id_ot int not null primary key,
    total_piezas int,
    total_manoobra int not null,
    total_tiempo float not null,
    foreign key(id_ot) references ot_cabecera(id)
);

create table factura_cabecera(
	id int auto_increment not null primary key,
    fecha_emision date not null,
    id_cliente int not null,
    id_ot int not null,
    foreign key (id_cliente) references cliente(id),
    foreign key (id_ot) references ot_cabecera(id)
);

create table factura_linea_pieza(
	id_factura int not null,
    n_linea int not null,
    id_pieza int not null,
    concepto varchar(50) unique not null,
    cantidad float not null,
    precio_unit float not null,
    id_tipo_iva int not null,
    primary key(id_factura, n_linea),
    foreign key (id_factura) references factura_cabecera(id),
    foreign key (id_pieza) references piezas(id),
    foreign key (id_tipo_iva) references tipo_iva(id)
);

create table factura_linea_mo (
	id_factura int not null,
    n_linea int not null,
    id_pieza int not null,
    concepto varchar(50) unique not null,
    cantidad float not null,
    precio_unit float not null,
    id_tipo_iva int not null,
    primary key (id_factura, n_linea),
    foreign key (id_factura) references factura_cabecera(id),
    foreign key (id_pieza) references piezas(id),
    foreign key(id_tipo_iva) references tipo_iva(id)
);

create table factura_linea (
	n_linea int auto_increment not null,
	id_factura int not null,
    concepto_pieza varchar(50),
    concepto_mo varchar(50),
    cantidad float not null,
    precio_unit float not null,
    id_tipo_iva int not null,
    primary key(n_linea, id_factura),
    foreign key (id_factura) references factura_cabecera(id),
    foreign key (concepto_pieza) references factura_linea_pieza(concepto),
    foreign key (concepto_mo) references factura_linea_mo(concepto),
    foreign key (id_tipo_iva) references tipo_iva(id)
);

ALTER TABLE factura_linea_pieza
	ADD foreign key (n_linea) references factura_linea(n_linea);
ALTER TABLE factura_linea_mo
	ADD foreign key (n_linea) references factura_linea(n_linea);
    
create table medio_pago (
	id int auto_increment not null primary key,
    descripcion varchar(50) not null
);

create table recibo (
	id int auto_increment not null,
    id_factura int not null,
    importe float not null,
    fecha date not null,
    id_mediopago int not null,
    primary key(id, id_factura),
    foreign key (id_mediopago) references medio_pago(id)
);
create table cliente_factura_recibo (
	id_cliente int not null,
    id_factura int not null,
    id_recibo int not null,
    primary key(id_cliente, id_factura, id_recibo),
    foreign key (id_cliente) references cliente(id),
    foreign key (id_factura) references factura_cabecera(id),
    foreign key (id_recibo) references recibo(id)
);

create table totales_factura (
	id_factura int not null,
    total_piezas float not null,
    total_mo float not null,
    iva float not null,
    total_factura float not null,
    primary key(id_factura),
    foreign key(id_factura) references factura_cabecera(id)
);

create table encuesta(
	id int auto_increment not null primary key,
    fecha_hora datetime not null,
    id_ot int not null,
    id_factura int not null,
    puntuacion int,
    foreign key (id_ot) references ot_cabecera(id),
    foreign key (id_factura) references factura_cabecera(id)
);
