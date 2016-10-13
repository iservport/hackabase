package org.helianto.hackabase.domain

import java.util.UUID
import javax.persistence.Id

import scala.beans.BeanProperty

@javax.persistence.Entity
class Project(@BeanProperty var entityId: String) {

  @BeanProperty @Id var id: String = UUID.randomUUID().toString.replaceAll("", "")

  @BeanProperty var projectName: String = ""

  @BeanProperty var projectDesc: String = ""

  def this() = this("") // empty constructor

}
