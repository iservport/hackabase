package org.helianto.hackabase.controller

import org.helianto.hackabase.domain.Project
import org.helianto.hackabase.service.ProjectService
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(Array("/api/project"))
class ProjectController(service: ProjectService) {

  @GetMapping
  def getProjectList = service.list

  @GetMapping(Array("/{id}"))
  def getProject(@PathVariable id: String) = service.get(id)

  @PostMapping(params = Array("entityId"))
  def postProject(@RequestParam entityId: String) = service.create(entityId)

  @PostMapping
  def putProject(@RequestBody command: Project) = service.saveOrUpdate(command)

}
