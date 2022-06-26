create table berries
(
    id         bigserial primary key,
    title      varchar(255)  not null,
    price      numeric(8, 2) not null
);

insert into berries (title, price)
values ('Черешня', 399),
       ('Клубника', 299),
       ('Голубика', 199);
