CREATE TABLE compras (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         producto VARCHAR(255) NOT NULL,
                         cantidad INT,
                         total DOUBLE
);