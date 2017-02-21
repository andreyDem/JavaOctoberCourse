select projects.id_project, projects.name_project, sum(developers.salary) as project_cost from developers, project_devs, projects where 
developers.id_developers=project_devs.id_dev and project_devs.id_project = projects.id_project
group by name_project order by project_cost desc limit 1;