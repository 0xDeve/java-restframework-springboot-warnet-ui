/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.warnet.controller;

import com.example.warnet.model.Clan;
import com.example.warnet.repository.ClanRepository;
import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Long
 */
@Controller
public class ClanController {
    @Autowired
    ClanRepository clanRepository;
    
    @RequestMapping("/clan")
    public String showClanIndex(ModelMap model){
        String longString = "";
        List<Clan> clanlist = clanRepository.findAll();
        for (Clan aclan : clanlist){
            longString += "<a href='/clan/" + aclan.getID() + "'>" + aclan.ToString() + "</a>" + "<br>";
        }
        model.put("data", longString);
        return "clanindex";
    }
    
    @GetMapping("/clan/createclan")
    public String showCreatePage(ModelMap model){
        return "createclan";
    }
    
    @PostMapping("/clan/createclan")
    public String showClan(ModelMap model, @RequestParam String clanname, @RequestParam String minrank, @RequestParam int maxmem){
       Clan clan = new Clan();
       clan.setClanName(clanname);
       clan.setMinRank(minrank);
       clan.setMaxPlayers(maxmem);
       clanRepository.save(clan); 
       return "redirect:/clan";
    }
    
    @GetMapping("/clan/{id}")
    public String getClanById(ModelMap model, @PathVariable(value = "id") Long clanid) {
        Clan clan = clanRepository.findOne(clanid);
        model.put("clanname", clan.getClanName());
        model.put("minrank", clan.getMinRank());
        model.put("maxmem", clan.getMaxPlayers());
        model.put("id", clan.getID());
        return "clanprofile";
    }

    @PostMapping("/clan/{id}")
    public String updateNote(@PathVariable(value = "id") Long clanid,
                                           @Valid @RequestParam String clanname, @RequestParam String minrank, @RequestParam int maxmem) {
        Clan clan = clanRepository.findOne(clanid);
        if(clan == null) {
            return "Error";
        }
        clan.setClanName(clanname);
        clan.setMinRank(minrank);
        clan.setMaxPlayers(maxmem);
        clanRepository.save(clan);
        return "redirect:/clan";
    }
    
    @GetMapping("/clan/{id}/deleted")
    public String deleteClan(@PathVariable(value = "id") Long clanId) {
        Clan clan = clanRepository.findOne(clanId);
        clanRepository.delete(clan);
        return "redirect:/clan";
    }
}
