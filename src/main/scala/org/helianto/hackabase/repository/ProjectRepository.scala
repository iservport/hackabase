package org.helianto.hackabase.repository

import org.helianto.hackabase.domain.Project
import org.springframework.data.jpa.repository.JpaRepository


trait ProjectRepository extends JpaRepository[Project, String] {

}
