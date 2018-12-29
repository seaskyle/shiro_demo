create table user_info (
	id int(10) primary key auto_increment,
	name varchar(50) not null unique,
	password varchar(250) not null,
	salt varchar (250),
	disable tinyint(1) default 0
);

create table role (
	id int(10) primary key auto_increment,
	name varchar(50) not null unique,
	display_name varchar (50) not null,
	disable tinyint(1) default 0
);

create table user_role (
	id int(10) primary key auto_increment,
	user_id int,
	role_id int,
	foreign key(user_id) references user_info(id),
	foreign key(role_id) references role(id)
);

create table resource (
	id int(10) primary key auto_increment,
	name varchar(30) not null unique,
	parent_id int(10),
	type varchar(20) not null,
	url varchar(100) not null,
	disable tinyint(1) default 0
);

create table permission (
	id int(10) primary key auto_increment,
	name varchar(30) not null unique,
	operate varchar(30) not null,
	disable tinyint(1) default 0,
  foreign key (resource_id) references resource(id)
);

create table role_permission (
	id int(10) primary key auto_increment,
	role_id int(10) not null,
	resource_id int(10) not null,
	permission_id int(10) not null,
	foreign key (role_id) references role(id),
	foreign key (resource_id) references resource(id),
	foreign key (permission_id) references permission(id)
);