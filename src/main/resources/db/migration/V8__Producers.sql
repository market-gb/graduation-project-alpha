create table producers
(
    id         bigserial primary key,
    title      varchar(255)  not null,
    address      varchar(255) not null
);

insert into producers (title, address)
values ('ООО Рога и Копыта', 'Москва'),
       ('Холдинг Шарашкина Контора', 'Cанкт-Петербург'),
       ('Концерн БухГатти', 'Милан'),
       ('Асссоциация с тремя с', 'Пыталово'),
       ('Фруктовый рай', 'Мурманск');