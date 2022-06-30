create table categories
(
    id         bigserial primary key,
    title      varchar(255)  not null,
    created_at          timestamp default current_timestamp,
    updated_at          timestamp default current_timestamp
);

insert into categories (title) values
   ('appliances'),
   ('tableware'),
    ('clothes')
;