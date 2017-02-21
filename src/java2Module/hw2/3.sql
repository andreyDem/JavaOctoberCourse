select sum(developers.salary) as total_salary from developers, skills, dev_skills where
developers.id_developers = dev_skills.id_dev and dev_skills.id_skill = skills.id_skill and
skills.name_skill like 'java' group by name_skill;