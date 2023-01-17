create table tbl_manufacturer
(
    id               int           not null PRIMARY KEY,
    name             varchar(255) not null,
    country          varchar(255),
    year_of_founding DATE
);

create table tbl_engine
(
    id       int not null PRIMARY KEY,
    power    int,
    capacity int,
    name     varchar(255)
);

create table tbl_car
(
    id              int not null PRIMARY KEY,
    engine_id       int FOREIGN KEY REFERENCES tbl_engine (id),
    manufacturer_id int FOREIGN KEY REFERENCES tbl_manufacturer (id),
    year            DATE
);

