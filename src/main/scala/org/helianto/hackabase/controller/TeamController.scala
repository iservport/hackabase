package org.helianto.hackabase.controller

import org.helianto.hackabase.domain.{Project, Team}
import org.helianto.hackabase.service.TeamService
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(Array("/api/team"))
class TeamController(service: TeamService) {

  @GetMapping(Array("/{projectId}"))
  def getMemberList(@PathVariable projectId: String) = service.list(projectId)

  @GetMapping(Array("/{id}"))
  def getMember(@PathVariable id: String) = service.get(id)

  @PostMapping(params = Array("projectId"))
  def postMember(@RequestParam projectId: String) = service.create(projectId)

  @PostMapping
  def putMember(@RequestBody command: Team) = service.saveOrUpdate(command)

}
