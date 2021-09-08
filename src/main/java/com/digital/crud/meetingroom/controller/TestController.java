package com.digital.crud.meetingroom.controller;

import com.digital.crud.meetingroom.model.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String home(){
        Room room = new Room( 1L, "JAVA", "07/09/2021", "8:00", "12:00");
        return "<pre>" + room.toString() + "</pre>";
    }
}
