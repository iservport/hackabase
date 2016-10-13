package org.helianto.hackabase.repository

import org.helianto.hackabase.domain.Team
import org.springframework.data.jpa.repository.JpaRepository

trait TeamRepository extends JpaRepository[Team, String] {

  def findByProjectId(projectId: String): java.util.List[Team]

}
