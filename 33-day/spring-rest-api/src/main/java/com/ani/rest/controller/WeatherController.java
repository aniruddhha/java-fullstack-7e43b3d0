package com.ani.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/weather")
@Controller
public class WeatherController {

    @Value("${ad.server.url}")
    private String server;
    
    //GET - http://localhost:8080/weather/
    @GetMapping("/")
    public String tempTdy() { // ❌
        return "20 Deg";
    }

    //GET - http://localhost:8080/weather/temp1
    @GetMapping("/temp1")
    public TempData tempTdy1() { // ❌
        return new TempData(12);
    }
    
    //GET - http://localhost:8080/weather/temp2
    @GetMapping(value = "/temp2", produces = "application/json") // ✅
    public @ResponseBody TempData tempTdy2() {
        return new TempData(12);
    }

    //GET - http://localhost:8080/weather/temp3
    @GetMapping(value  = "/temp3", produces = MediaType.APPLICATION_JSON_VALUE ) // ✅
    public @ResponseBody TempData tempTdy3() {
        return new TempData(12);
    }

    //GET - http://localhost:8080/weather/temp4
    @GetMapping(value = "/temp4", produces = MediaType.APPLICATION_JSON_VALUE ) // ✅
    public @ResponseBody ResponseEntity<TempData> tempTdy4() {
        TempData td = new TempData(12);
        return ResponseEntity.status(HttpStatus.OK).body(td);
    }

    //POST - http://localhost:8080/weather/save
    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Res> saveTemp(@RequestBody TempData td) {

        Res res = new Res("success", td.getTemp() + " temp marked");

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping(value = "/ads", produces = MediaType.APPLICATION_JSON_VALUE ) // ✅
    public @ResponseBody ResponseEntity<Res> showAds() {
        Res res = new Res("success", "fetching ads from "+ server);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

}
