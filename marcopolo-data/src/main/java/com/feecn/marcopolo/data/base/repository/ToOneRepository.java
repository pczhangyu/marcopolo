package com.feecn.marcopolo.data.base.repository;

import com.feecn.marcopolo.data.base.entity.ToOne;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToOneRepository extends JpaRepository<ToOne,Long> {

}
