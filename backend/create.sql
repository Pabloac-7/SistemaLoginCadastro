create sequence hibernate_sequence start 1 increment 1;
create table tb_users (id int4 not null, nome varchar(255), senha varchar(255), primary key (id));
