/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.warnet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author Long
 */
@Entity
@Table(name = "clan")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
public class Clan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank
    private String clanName;
    
    @NotBlank
    private String minRank;
    
    
    private int maxPlayers;
    
    public Long getID(){
        return id;
    }
    
    public String getClanName(){
        return clanName;
    }
    
    public void setClanName(String clanname){
        this.clanName = clanname;
    }
    
    public String getMinRank(){
        return minRank;
    }
    
    public void setMinRank(String minrank){
        this.minRank = minrank;
    }
    
    public int getMaxPlayers(){
        return maxPlayers;
    }
    
    public void setMaxPlayers(int maxplayers){
        this.maxPlayers = maxplayers;
    }
    
    public String ToString(){
        return "Clan name: " + clanName + ", minimum rank: " + minRank + ", maximum players: " + maxPlayers;
    }
}
