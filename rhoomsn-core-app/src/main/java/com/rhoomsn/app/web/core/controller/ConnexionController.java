package com.rhoomsn.app.web.core.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhoomsn.app.web.entity.Connexion;

@RestController
@RequestMapping("home")
public class ConnexionController {
	
	  @RequestMapping("/user")
	  public Connexion user(Connexion user) {
	    return user;
	  }

}
