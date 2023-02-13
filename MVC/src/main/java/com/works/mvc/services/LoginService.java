package com.works.mvc.services;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.works.mvc.entities.login;
import com.works.mvc.repositories.LoginRepository;

@Service
@RequiredArgsConstructor
public class LoginService {

    final LoginRepository loginRepository;

    //Register

    public boolean register (login login){
        try {
            loginRepository.save(login);
            System.out.println(login);
            return true;
        }catch (Exception e ){
            return  false;
        }
    }
}
