package com.anonymousmoose.tibiatools.controller;

import com.anonymousmoose.tibiatools.openapi.model.Vocation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/points")
public class ExperienceController {
    @GetMapping("/mana")
    @ResponseBody
    public ResponseEntity<Integer> getManaPoints(@RequestParam("vocation") Vocation voc, @RequestParam("level") int lvl) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/health")
    @ResponseBody
    public Integer getHealthPoints(@RequestParam("vocation") Vocation voc, @RequestParam("level") int lvl) {
        return 5;
    }

    @GetMapping("/experience")
    @ResponseBody
    public Integer getExperiencePoints(@RequestParam("vocation") Vocation voc, @RequestParam("level") int lvl) {
        return 5;
    }
}
