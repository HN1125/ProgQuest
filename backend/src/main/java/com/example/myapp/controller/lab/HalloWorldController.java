package com.example.myapp.controller.lab;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.base.constraints.CommonConst;

@RestController
@RequestMapping(CommonConst.LAB_URI)
public class HalloWorldController {

    @GetMapping("hallo-world")
    public String getString() {
        return "Hallo World !!";
    }

    @GetMapping("hallo-world-json")
    public Map<String, String> getJsonString() {
        return Map.of("message", "Hallo World !!");
    }
}
