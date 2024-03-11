--liquibase formatted sql

--changeset bobrovich:create_products_schema
CREATE SCHEMA IF NOT EXISTS products;

--changeset bobrovich:create_product_table
CREATE TABLE IF NOT EXISTS product
(
    uuid        UUID                        NOT NULL,
    name        VARCHAR(255)                NOT NULL,
    create_date TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    update_date TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT pk_product PRIMARY KEY (uuid)
);

ALTER TABLE product
    ADD CONSTRAINT uc_product_name UNIQUE (name);

--changeset bobrovich:init_product_data
INSERT INTO product (uuid, name, create_date, update_date)
VALUES
    ('c502f106-ca77-42df-bee4-5bc3bb337459', 'Апельсин', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('3605ba3f-2779-4ef3-80c5-7da9067525bf', 'Мандарин', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('2765b6e5-fce1-4f3d-aedd-0c962dac3e30', 'Лимон', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
    ('6427c005-d159-4cb8-9b11-a5f14e612228', 'Манго', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
