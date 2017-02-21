select avg(salary) from developers, project_devs, projects
where developers.id_developers = project_devs.id_dev and
      project_devs.id_project = projects.id_project
having min(cost);