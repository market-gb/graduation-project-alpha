create table catalog
(
    id   bigserial primary key,
    name varchar(255) not null
);

insert into catalog (name)
values ('Компьютеры'),
       ('Бытовая техника'),
       ('Офисная техника'),
       ('Мобильная техника'),
       ('Транспортная техника'),
       ('Ягоды');
