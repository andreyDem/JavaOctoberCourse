ALTER TABLE projects ADD cost int;

UPDATE projects SET cost = 8500 WHERE id_project = 1;
UPDATE projects SET cost = 3500 WHERE id_project = 2;
UPDATE projects SET cost = 5500 WHERE id_project = 3;
UPDATE projects SET cost = 9000 WHERE id_project = 4;