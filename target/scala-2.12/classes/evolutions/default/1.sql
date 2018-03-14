# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table artist (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  genre                         varchar(255),
  city                          varchar(255),
  country                       varchar(255),
  constraint pk_artist primary key (id)
);

create table member (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_member primary key (email)
);

create table product (
  id                            bigint auto_increment not null,
  album_name                    varchar(255),
  year                          varchar(255),
  type                          varchar(255),
  price                         double not null,
  stock                         integer not null,
  constraint pk_product primary key (id)
);


# --- !Downs

drop table if exists artist;

drop table if exists member;

drop table if exists product;

