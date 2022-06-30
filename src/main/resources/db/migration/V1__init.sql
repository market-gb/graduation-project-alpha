create table products
(
    id         bigserial primary key,
    title      varchar(255)  not null,
    price      numeric(8, 2) not null
);

insert into products (title, price)
values ('Milk', 50.20),
       ('Bread', 20.20),
       ('Cheese', 490.20),
       ('Apple', 90.00),
       ('Orange', 90.00),
       ('Fish', 290.00),
       ('Meat', 350.00),
       ('Cabbage', 20.00),
       ('Carrot', 18.00),
       ('Onion', 32.00),
       ('Candies', 450.00);