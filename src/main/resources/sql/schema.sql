CREATE TABLE IF NOT EXISTS authors
(
    name VARCHAR(60) PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS albums
(
    name VARCHAR(60),
    content  VARCHAR(60),
    author VARCHAR(60),
    primary key (name, author),
    foreign key (author) references authors (name)
);