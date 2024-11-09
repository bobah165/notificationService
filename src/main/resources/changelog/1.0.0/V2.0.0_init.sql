--DROP SCHEMA IF EXISTS general CASCADE;

CREATE SCHEMA IF NOT EXISTS general;

--UTILS SCHEMA

CREATE TABLE general.notification
(
    id varchar NOT NULL,
    message varchar NOT NULL,
    CONSTRAINT pk_notification
        PRIMARY KEY (id)
);


