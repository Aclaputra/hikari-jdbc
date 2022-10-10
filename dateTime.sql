CREATE TABLE sample_time(
  id INT NOT NULL AUTO_INCREMENT,
  sample_date DATE,
  sample_time TIME,
  sample_timestamp TIMESTAMP,
  PRIMARY KEY (id)
) ENGINE = 'InnoDB';

DESC sample_time;

SELECT * FROM sample_time;
