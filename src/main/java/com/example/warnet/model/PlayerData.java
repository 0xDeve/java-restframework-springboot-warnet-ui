/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.warnet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 *
 * @author Long
 */
@Entity
@Table(name = "playerinfo")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
public class PlayerData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    private String user;
    
    
    private String password;
    
    
    private String email;
    
    
    private String gameid;
    
    public Long getID(){
        return id;
    }
    
    public String getUserName(){
        return user;
    }
    
    public void setUserName(String username){
        this.user = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getGameId(){
        return gameid;
    }
    
    public void setGameId(String gameid){
        this.gameid = gameid;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String ToString(){
        return "Username: " + user + ". Password:" + password + ". Email: " + email + ". GameID: " + gameid;   
    }
}
