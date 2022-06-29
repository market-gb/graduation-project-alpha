create table users
(
    id         bigserial primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    email      varchar(255) not null
);

insert into users (first_name, last_name, email)
values ('Ivan', 'Ivanov', 'ivanov@mail.ru'),
       ('Petr', 'Petrov', 'petrov@mail.ru'),
       ('Semen', 'Semenov', 'semenov@mail.ru');
