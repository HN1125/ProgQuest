package com.example.myapp.controller.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.base.constraints.CommonConst;

@RestController
@RequestMapping(CommonConst.LAB_URI)
public class HalloWorldController {

    @GetMapping("hallo-world")
    public String halloWorld() {
        return "Hallo World !!";
    }

}
