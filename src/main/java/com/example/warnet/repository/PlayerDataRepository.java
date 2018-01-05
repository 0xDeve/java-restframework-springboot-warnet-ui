/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.warnet.repository;
import com.example.warnet.model.PlayerData;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Long
 */
public interface PlayerDataRepository extends JpaRepository<PlayerData, Long> {

}
