package com.works.mvc.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.nio.file.LinkOption;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

@Entity
@Data
public class login {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long lid;


  @Length(min = 2, max = 100)
  @NotEmpty
  @NotNull
  @Column(length = 100)
  private String name;

  @NotEmpty
  @NotNull
  @Email
  @Column(unique = true)
  private String email;

  @NotEmpty
  @NotNull
  @Column(length = 500)
  private String password;

}
