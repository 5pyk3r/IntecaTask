-- create the databases
CREATE DATABASE IF NOT EXISTS db;

CREATE TABLE IF NOT EXISTS product (
                         id   INTEGER      NOT NULL AUTO_INCREMENT,
                         product_name VARCHAR(128) NOT NULL,
                         value INTEGER NOT NULL,
                         PRIMARY KEY (id)
);
