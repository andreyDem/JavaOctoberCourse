select companies.name_company, customers.name_customer, projects.name_project,
  min(projects.cost) as total from customers
  inner join customers_project on customers.id_customer = customers_project.id_cust
  inner join projects on customers_project.id_proj = projects.id_project
  inner join project_devs on projects.id_project = project_devs.id_project
  inner join company_devs on company_devs.id_dev = project_devs.id_dev
  inner join companies on company_devs.id_company = companies.id_company
order by cost;