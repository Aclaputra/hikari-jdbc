CREATE TABLE comments(
  id INT NOT NULL AUTO_INCREMENT,
  email VARCHAR(100),
  comment TEXT,
  PRIMARY KEY (id)
) ENGINE = InnoDB;

SELECT * FROM comments;

SELECT COUNT(id) FROM comments;

-- DELETE FROM comments;
