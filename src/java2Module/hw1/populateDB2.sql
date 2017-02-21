
insert into developers (name_dev, surname_dev) values ('Andrey', 'Demchuk');
insert into developers (name_dev, surname_dev) values ('Alexey', 'Gira');
insert into developers (name_dev, surname_dev) values ('Vadim', 'Timchenko');
insert into developers (name_dev, surname_dev) values ('Fedor', 'Petrenko');
insert into developers (name_dev, surname_dev) values ('Olga', 'Matveeva');
insert into developers (name_dev, surname_dev) values ('Anna', 'Dvari');



insert into skills (name_skill) value ('Java');
insert into skills (name_skill) value ('SQL');
insert into skills (name_skill) value ('Python');
insert into skills (name_skill) value ('C++');
insert into skills (name_skill) value ('C#');
insert into skills (name_skill) value ('JavaScript');
insert into skills (name_skill) value ('Tomcat');
insert into skills (name_skill) value ('Jira');
insert into skills (name_skill) value ('Trello');
insert into skills (name_skill) value ('Scrum');



insert into customers (name_customer) value ('Fedorovich');
insert into customers (name_customer) value ('Grigorievich');
insert into customers (name_customer) value ('Borisovich');
insert into customers (name_customer) value ('Stepanovna');
insert into customers (name_customer) value ('Petrovna');
insert into customers (name_customer) value ('Illich');



insert into companies (name_company) value ('LuxSoft');
insert into companies (name_company) value ('InfoPulse');
insert into companies (name_company) value ('EPAM');
insert into companies (name_company) value ('GlobalLogic');
insert into companies (name_company) value ('Ciklum');
insert into companies (name_company) value ('PlayTech');



insert into projects (name_project) value ('Search people app');
insert into projects (name_project) value ('Android game app');
insert into projects (name_project) value ('Stealth gadget');
insert into projects (name_project) value ('Portable teleport station');

insert into comp_project (id_project, id_comp) values (1, 1); 
insert into comp_project (id_project, id_comp) values (2, 2); 
insert into comp_project (id_project, id_comp) values (3, 3); 
insert into comp_project (id_project, id_comp) values (4, 4); 

insert into companies_customers (id_company, id_customer) values (1, 1);
insert into companies_customers (id_company, id_customer) values (2, 2);
insert into companies_customers (id_company, id_customer) values (3, 3);
insert into companies_customers (id_company, id_customer) values (4, 4);
insert into companies_customers (id_company, id_customer) values (5, 5);
insert into companies_customers (id_company, id_customer) values (6, 6);

insert into company_devs (id_company, id_dev) values (1, 1);
insert into company_devs (id_company, id_dev) values (1, 2);
insert into company_devs (id_company, id_dev) values (2, 3);
insert into company_devs (id_company, id_dev) values (2, 4);
insert into company_devs (id_company, id_dev) values (3, 5);
insert into company_devs (id_company, id_dev) values (3, 6);

insert into customers_project (id_cust, id_proj) values (1, 1);
insert into customers_project (id_cust, id_proj) values (2, 2);
insert into customers_project (id_cust, id_proj) values (3, 3);
insert into customers_project (id_cust, id_proj) values (4, 4);

insert into dev_skills (id_dev, id_skill) values (1, 1);
insert into dev_skills (id_dev, id_skill) values (1, 2);
insert into dev_skills (id_dev, id_skill) values (1, 3);
insert into dev_skills (id_dev, id_skill) values (2, 1);
insert into dev_skills (id_dev, id_skill) values (2, 4);
insert into dev_skills (id_dev, id_skill) values (2, 10);
insert into dev_skills (id_dev, id_skill) values (3, 1);
insert into dev_skills (id_dev, id_skill) values (3, 5);
insert into dev_skills (id_dev, id_skill) values (4, 2);
insert into dev_skills (id_dev, id_skill) values (4, 7);
insert into dev_skills (id_dev, id_skill) values (5, 1);
insert into dev_skills (id_dev, id_skill) values (5, 3);
insert into dev_skills (id_dev, id_skill) values (5, 8);
insert into dev_skills (id_dev, id_skill) values (6, 5);
insert into dev_skills (id_dev, id_skill) values (6, 6);
insert into dev_skills (id_dev, id_skill) values (6, 9);

insert into project_devs (id_project, id_dev) values (1, 1);
insert into project_devs (id_project, id_dev) values (1, 2);
insert into project_devs (id_project, id_dev) values (2, 3);
insert into project_devs (id_project, id_dev) values (2, 4);
insert into project_devs (id_project, id_dev) values (3, 5);
insert into project_devs (id_project, id_dev) values (3, 6);
insert into project_devs (id_project, id_dev) values (4, 1);
insert into project_devs (id_project, id_dev) values (4, 6);


