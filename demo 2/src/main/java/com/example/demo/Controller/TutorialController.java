package com.example.demo.Controller;

import com.example.demo.Model.TutorialEntity;
import com.example.demo.repo.TutorialRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TutorialController {

  @Autowired
  TutorialRepo testrepo;


  @GetMapping("/")
  public List<TutorialEntity> getTest() {
    List<TutorialEntity> list = testrepo.findAll();
    return list;
  }
}
