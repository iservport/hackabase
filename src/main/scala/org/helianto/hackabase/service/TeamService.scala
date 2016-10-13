package org.helianto.hackabase.service

import org.helianto.hackabase.domain.Team
import org.helianto.hackabase.repository.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TeamService {

  @Autowired val teamRepository: TeamRepository = null

  def list(projectId: String) = teamRepository.findByProjectId(projectId)

  def get(id: String) = teamRepository.findOne(id)

  def create(projectId: String) = new Team(projectId)

  def saveOrUpdate(command: Team) = {
    val team = Option(teamRepository.findOne(command.id)) match {
      case Some(t) => t
      case None => new Team(command.projectId)
    }
    team.identityId = command.identityId
    team.identityName = command.identityName
    team.joined = command.joined
    team.imageUrl = command.imageUrl
    team.currentRole = command.currentRole
    teamRepository.saveAndFlush(team)
  }

}
