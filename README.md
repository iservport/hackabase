# hackabase
Free startup project database

API basics:

  A list of projects: GET /api/project

  One project: GET /api/project/:id

  New project: POST /api/project/:entityId

  Update project: PUT /api/project (request body having a project)

  A list of team members: GET /api/team/:projectId

  One member: GET /api/team/:id

  New member: POST /api/team/:projectId

  Update member: PUT /api/team (request body having a team member)

