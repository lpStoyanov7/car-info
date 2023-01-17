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
    engine_id       int not null,
    manufacturer_id int not null,
    year            DATE,
    constraint fk_car_engine
        foreign key (engine_id)
            REFERENCES tbl_engine (id),
    constraint fk_car_manufacturer4
        foreign key (manufacturer_id)
            REFERENCES tbl_manufacturer (id)
);

