create table tbl_manufacturer
(
    id               int           not null PRIMARY KEY,
    name             nvarchar(255) not null,
    country          nvarchar(255),
    year_of_founding datetime2
);
go
create table tbl_engine
(
    id       int not null PRIMARY KEY,
    power    int,
    capacity int,
    name     nvarchar(255)
);
go
create table tbl_car
(
    id              int not null PRIMARY KEY,
    engine_id       int FOREIGN KEY REFERENCES tbl_engine (id),
    manufacturer_id int FOREIGN KEY REFERENCES tbl_manufacturer (id),
    year            datetime2
);

