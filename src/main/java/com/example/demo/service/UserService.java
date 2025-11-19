package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.repository.UserRespository;

@Service
public class UserService {

  @Autowired
  private UserRespository userRespository;

  public User findOneByid(Long id) {
    return this.userRespository.findById(id)
        .orElseThrow(() -> new NotFoundException("Usuário com ID " + id + " não encontrado."));
  }
}
