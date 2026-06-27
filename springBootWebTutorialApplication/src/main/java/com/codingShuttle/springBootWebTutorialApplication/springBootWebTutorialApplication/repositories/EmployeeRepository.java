package com.codingShuttle.springBootWebTutorialApplication.springBootWebTutorialApplication.repositories;

import com.codingShuttle.springBootWebTutorialApplication.springBootWebTutorialApplication.dto.EmployeeDTO;
import com.codingShuttle.springBootWebTutorialApplication.springBootWebTutorialApplication.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
