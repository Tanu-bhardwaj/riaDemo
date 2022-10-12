package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "test")
public class TutorialEntity extends parent {

  @Column(name = "name", unique = true, nullable = false)
  private String name;

  @Column(name = "nick_name", nullable = false)
  private String nickName;
}
