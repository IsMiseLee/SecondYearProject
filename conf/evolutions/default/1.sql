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

create table artist_product (
  artist_id                     bigint not null,
  product_id                    bigint not null,
  constraint pk_artist_product primary key (artist_id,product_id)
);

create table basket (
  id                            bigint auto_increment not null,
  customer_email                varchar(255),
  constraint uq_basket_customer_email unique (customer_email),
  constraint pk_basket primary key (id)
);

create table member (
  role                          varchar(255),
  email                         varchar(255) not null,
  name                          varchar(255),
  password                      varchar(255),
  street1                       varchar(255),
  street2                       varchar(255),
  city                          varchar(255),
  credit_card                   varchar(255),
  constraint pk_member primary key (email)
);

create table order_item (
  id                            bigint auto_increment not null,
  order_id                      bigint,
  basket_id                     bigint,
  product_id                    bigint,
  quantity                      integer not null,
  price                         double not null,
  constraint pk_order_item primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  album_name                    varchar(255),
  year                          varchar(255),
  art_name                      varchar(255),
  price                         double not null,
  stock                         integer not null,
  constraint pk_product primary key (id)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  customer_email                varchar(255),
  constraint pk_shop_order primary key (id)
);

alter table artist_product add constraint fk_artist_product_artist foreign key (artist_id) references artist (id) on delete restrict on update restrict;
create index ix_artist_product_artist on artist_product (artist_id);

alter table artist_product add constraint fk_artist_product_product foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_artist_product_product on artist_product (product_id);

alter table basket add constraint fk_basket_customer_email foreign key (customer_email) references member (email) on delete restrict on update restrict;

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_product_id foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_order_item_product_id on order_item (product_id);

alter table shop_order add constraint fk_shop_order_customer_email foreign key (customer_email) references member (email) on delete restrict on update restrict;
create index ix_shop_order_customer_email on shop_order (customer_email);


# --- !Downs

alter table artist_product drop constraint if exists fk_artist_product_artist;
drop index if exists ix_artist_product_artist;

alter table artist_product drop constraint if exists fk_artist_product_product;
drop index if exists ix_artist_product_product;

alter table basket drop constraint if exists fk_basket_customer_email;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_product_id;
drop index if exists ix_order_item_product_id;

alter table shop_order drop constraint if exists fk_shop_order_customer_email;
drop index if exists ix_shop_order_customer_email;

drop table if exists artist;

drop table if exists artist_product;

drop table if exists basket;

drop table if exists member;

drop table if exists order_item;

drop table if exists product;

drop table if exists shop_order;

