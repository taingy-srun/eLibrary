package edu.miu.cs489.taingy.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ELibraryController {

    @GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
    public String home() {
        return "/home/index.html";
    }
}
