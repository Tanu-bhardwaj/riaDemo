package com.example.demo.repo;

import com.example.demo.Model.TutorialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepo extends JpaRepository<TutorialEntity,Long> {

}
