package com.develhope.SpringAdvanced0202.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/v1")
public class BasicController {

    @GetMapping("/randomintsum")
    public @ResponseBody Integer sumRandomInts () {
        return ThreadLocalRandom.current().nextInt() + ThreadLocalRandom.current().nextInt();
    }
}
