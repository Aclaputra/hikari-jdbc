CREATE TABLE admin (
  username VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (username)
) ENGINE = InnoDB;

INSERT INTO admin(username, password) VALUES ('admin', 'admin');

SELECT * FROM admin;
