package com.nhnacademy.taskapi.dooraytaskapi.repository;

import com.nhnacademy.taskapi.dooraytaskapi.domain.UserIdOnlyDto;
import com.nhnacademy.taskapi.dooraytaskapi.entity.ProjectUser;
import com.nhnacademy.taskapi.dooraytaskapi.repository.custom.ProjectUserRepositoryCustom;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectUserRepository extends JpaRepository<ProjectUser, ProjectUser.Pk>,
    ProjectUserRepositoryCustom {

}
