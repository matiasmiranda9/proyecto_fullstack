CREATE TABLE inventario (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            nombre_producto VARCHAR(255) NOT NULL,
                            stock_actual INT,
                            ubicacion VARCHAR(100)
);