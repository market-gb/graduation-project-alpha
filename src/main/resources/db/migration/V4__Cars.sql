create table cars
(
    id         bigserial primary key,
    model      varchar(255)  not null,
    price      numeric(8, 2) not null
);

insert into cars (model, price)
values ('Acura TLX Technology', 41493.00),
       ('Mitsubishi Outlander', 22000.00),
       ('Nissan Pathfinder SL', 29489.00),
       ('BMW 530e iPerformance', 39900.00),
       ('Tesla Model 3 Long Range', 64997.00);