package com.Geester.EventManagment.Controller;

import com.Geester.EventManagment.Model.eventInfo;
import com.Geester.EventManagment.Model.userInfo;
import com.Geester.EventManagment.Service.services;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController

public class controller {
    @Autowired
    services service;
    @PostMapping("/addStudent")
    public String addUser(@RequestBody userInfo user){
        return service.postUser(user);
    }
    @PostMapping("/addEvent")
    public String addEvent(@RequestBody eventInfo event){
        return service.postEvent(event);
    }
    @GetMapping("/userdata/id")
     public userInfo fetchuser(@RequestParam String id) {


            return service.getuser(Integer.valueOf(id));
        }


     @GetMapping("/GetAllStudent")
    public List<userInfo> showAlluser(){
        return service.showAll();
     }
     @GetMapping("/allEvent")
    public List<eventInfo> showAllEvent(){
        return service.showAllEvent();
     }
     @PutMapping("/updateStudentDepartment/id")
    public String updateStudentDepartment(@RequestParam String id){
        userInfo temp = service.getuser(Integer.valueOf(id));
        temp.setDepartment();

     }





}
