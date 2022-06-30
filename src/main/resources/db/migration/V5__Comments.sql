create table comments
(
    id         bigserial primary key,
    text      varchar(255)  not null,
    author_name varchar(255)  not null,
    created_at          timestamp default current_timestamp
);

insert into comments (text, author_name) values
   ('Great product. I am happy.', 'Lucky'),
   ('I didnt like its color', 'Grumbler'),
   ('Worst internet shop which i ever seen', 'Grumbler'),
   ('Great store with a good range of products', 'grateful buyer');