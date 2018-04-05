# --- Sample dataset

# --- !Ups

insert into product (id,album_name,year,art_name,price,stock) values (1,'Government Plates','2013','Death girps',12.00,9);
insert into product (id,album_name,year,art_name,price,stock) values (2,'American Idiot','2004','Green day',8.00,2);
insert into product (id,album_name,year,art_name,price,stock) values (3,'Master Of Puppets','1986','Metallica',11.00,7);
insert into product (id,album_name,year,art_name,price,stock) values (4,'MEGA','206','Blank banshee',22.00,8);

insert into artist (id,name,genre,city,country) values (1,'Death grips','Experimental hip hop','LA','USA');
insert into artist (id,name,genre,city,country) values (2,'Green day','Punk/Rock','CA','USA');

insert into member (email,name,password,role) values ( 'admin@AuralSoul.com', 'Lee Admin', 'password', 'admin' );
insert into member (email,name,password,role) values ( 'manager@products.com', 'Bob Manager', 'password', 'manager' );
insert into member (email,name,password,role) values ( 'customer@products.com', 'Sean Customer', 'password', 'customer' );

insert into artist_product (artist_id,product_id) values (1,1);
insert into artist_product (artist_id,product_id) values (2,2);