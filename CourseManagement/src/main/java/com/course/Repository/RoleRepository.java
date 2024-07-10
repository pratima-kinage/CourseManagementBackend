package com.course.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.Model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
