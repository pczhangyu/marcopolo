package com.feecn.data.base.repository;

import com.feecn.data.base.entity.ToOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToOneRepository extends JpaRepository<ToOne,Long> {

}
