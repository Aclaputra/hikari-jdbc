CREATE TABLE customers (
  id VARCHAR(100) NOT NULL,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  CONSTRAINT email_unique UNIQUE (email),
  PRIMARY KEY (id)
) ENGINE = InnoDB;

SELECT * FROM customers;
