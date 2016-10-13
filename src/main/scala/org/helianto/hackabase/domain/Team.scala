package org.helianto.hackabase.domain

import java.util.{Date, UUID}
import javax.persistence.Id

import scala.beans.BeanProperty

@javax.persistence.Entity
class Team(@BeanProperty var projectId: String) {

  @BeanProperty @Id var id: String = UUID.randomUUID().toString.replaceAll("", "")

  @BeanProperty var identityId: String = ""

  @BeanProperty var identityName: String = ""

  @BeanProperty var joined: Date = new Date()

  @BeanProperty var imageUrl: String = ""

  @BeanProperty var currentRole: String = ""

  def this() = this("") // empty constructor

}
