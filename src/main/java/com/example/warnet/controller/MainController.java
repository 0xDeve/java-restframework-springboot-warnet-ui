package com.example.warnet.controller;

import com.example.warnet.model.PlayerData;
import com.example.warnet.repository.PlayerDataRepository;
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

@Controller
public class MainController {

    /*@Autowired
    NoteRepository noteRepository;*/
    @Autowired
    PlayerDataRepository playerDataRepository;
    
    @RequestMapping(value = "/")
    public String index(ModelMap model){
        model.put("message", "WarNet databases simple UI");
        String longString = "";
        List<PlayerData> dataList = playerDataRepository.findAll();
        for (PlayerData data: dataList){
            longString += "<a href='/playerdata/" + data.getID() + "'>" + data.ToString() + "</a>" + "<br>";
        }
        model.put("data", longString);
        return "index";
    }
    
    @GetMapping("/register")
    public String showRegister(){
        return "register";
    }
    
    @PostMapping("/register")
    public String showMainPage(@RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam String gameid){
        PlayerData data = new PlayerData();
        data.setUserName(username);
        data.setPassword(password);
        data.setEmail(email);
        data.setGameId(gameid);
        playerDataRepository.save(data);
        return "redirect:/";
    }

    @GetMapping("/playerdata/{id}")
    public String getPlayerDataById(ModelMap model, @PathVariable(value = "id") Long playerdataid) {
        PlayerData playerdata = playerDataRepository.findOne(playerdataid);
        model.put("username", playerdata.getUserName());
        model.put("password", playerdata.getPassword());
        model.put("email", playerdata.getEmail());
        model.put("gameid", playerdata.getGameId());
        model.put("id", playerdata.getID());
        return "profile";
    }

    @PostMapping("/playerdata/{id}")
    public String updateNote(@PathVariable(value = "id") Long playerdataid,
                                           @Valid @RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam String gameid) {
        PlayerData playerdata = playerDataRepository.findOne(playerdataid);
        if(playerdata == null) {
            return "Error";
        }
        playerdata.setUserName(username);
        playerdata.setPassword(password);
        playerdata.setEmail(email);
        playerdata.setGameId(gameid);
        PlayerData updatedPlayerData = playerDataRepository.save(playerdata);
        return "redirect:/";
    }
    
    
    @GetMapping("/playerdata/{id}/deleted")
    public String deletePlayerData(@PathVariable(value = "id") Long playerDataId) {
        PlayerData playerdata = playerDataRepository.findOne(playerDataId);
        playerDataRepository.delete(playerdata);
        return "redirect:/";
    }
}
