create table user_info (
	id int(10) primary key auto_increment,
	name varchar(50) not null unique,
	passwrod varchar(50) not null
)

create table role (
	id int(10) primary key auto_increment,
	name varchar(50) not null unique
)

create table user_role (
	id int(10) primary key auto_increment,
	user_id int,
	role_id int,
	foreign key(user_id) references user_info(id),
	foreign key(role_id) references role(id)
)

create table menu (
	id int(10) primary key auto_increment,
	parent_id int(10),
	type varchar(20) not null,
	url varchar(100) not null,
	foreign key(parent_id) references menu(id)
)

create table role_menu (
	id int(10) primary key auto_increment,
	role_id int(10),
	menu_id int(10),
	foreign key (role_id) references role(id),
	foreign key (menu_id) references menu(id)
)