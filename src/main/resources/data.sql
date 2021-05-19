DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
  id INT,
  name VARCHAR(250) NOT NULL,
  department VARCHAR(250) NOT NULL
);

INSERT INTO EMPLOYEE (ID, NAME, DEPARTMENT) VALUES
  (1, 'harsh', 'SBSToolbox'),
  (2, 'Sonali', 'SBSToolbox'),
  (3, 'nishant', 'Tango');
