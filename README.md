# customerloginpage
A registration page for a company having user and admin login 
To run this project create a db with name customer.
There are three tables required for authenticating spring boot security. The three tables are USERS, ROLE and USER_ROLE. The Users table contains user related details such as username, password etc. The role table contains the roles supported in the spring boot security. The users and role table has many to many relationship using user_role table. The mysql database is used in this example. The sql is as below
drop table users_role;
drop table role;
drop table users;

create table users(
user_id int primary key AUTO_INCREMENT,
username varchar(50) unique not null,
password varchar(50) not null,
disabled boolean default false,
account_expired boolean default false,
account_locked boolean default false,
credentials_expired boolean default false
);

create table role (
role_id integer primary key AUTO_INCREMENT,
role_name varchar(50)
);

create table user_role (
user_role_id integer primary key AUTO_INCREMENT,
user_id integer references users(user_id),
role_id integer references role(role_id)
);

The below sql will provide the sample data in the database table. This data is used to test the spring boot security in this example. The password is not encrypted in this example. The encryption code is modified to insert the encrypted password.
insert into role (role_name) values('ADMIN');
insert into role (role_name) values('USER');

insert into users (username, password) values('admin', 'password');
insert into users (username, password) values('user', 'password');

insert into user_role (user_id, role_id) values(1,1);
insert into user_role (user_id, role_id) values(2,2);
