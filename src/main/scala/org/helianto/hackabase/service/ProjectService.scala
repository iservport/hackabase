package org.helianto.hackabase.service

import org.helianto.hackabase.domain.Project
import org.helianto.hackabase.repository.ProjectRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProjectService {

  @Autowired val projectRepository: ProjectRepository = null

  def list = projectRepository.findAll

  def get(id: String) = projectRepository.findOne(id)

  def create(entityId: String) = new Project(entityId)

  def saveOrUpdate(command: Project) = {
    val project = Option(projectRepository.findOne(command.id)) match {
      case Some(p) => p
      case None => new Project(command.entityId)
    }
    project.projectName = command.projectName
    project.projectDesc = command.projectDesc
    projectRepository.saveAndFlush(project)
  }

}
