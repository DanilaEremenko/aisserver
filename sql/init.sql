create table vessel_type
(
    id   serial primary key,
    name varchar
);
create table vessel
(
    id      serial primary key,
    type_id int,
    name    varchar,
    mmsi    int,
    imo     int unique,

    foreign key (type_id) references vessel_type (id)
);

create table ais_source
(
    id   serial primary key,
    name varchar
);

create table ais_track
(
    id          serial primary key,
    vessel_id   int       not null,
    source_id   int,
    status_code int,


    latitude    float     not null,
    longitude   float     not null,
    position    geometry,
    destination varchar,

    heading     float,
    course      float,
    draught     float,
    speed       float,
    rot         float,

    eta         timestamp,
    rec_date    timestamp not null,

    foreign key (vessel_id) references vessel (id),
    foreign key (source_id) references ais_source (id)

);

create index on ais_track using hash (vessel_id);
create index on ais_track using hash (source_id);