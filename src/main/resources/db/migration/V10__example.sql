create table example
(
    id         bigserial primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null
);

insert into example (first_name, last_name)
values ('Вася', 'Пупкин'),
       ('Иван', 'Иванов'),
       ('Петр', 'Петров');
