package com.Geester.EventManagment.Service;


import com.Geester.EventManagment.Model.eventInfo;
import com.Geester.EventManagment.Model.userInfo;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class services {



    HashMap<Integer , userInfo> userdata = new HashMap<>();
    HashMap<Integer, eventInfo> eventdata = new HashMap<>();

    public String postUser(userInfo data){
        userdata.put(data.getStudentId(),data);
        return  "Posting User Done"+data.getStudentId();

    }
    public String postEvent(eventInfo event){
         eventdata.put(event.getEventId(),event);
         return "Posting Event Done "+ event.getEventId();
    }
    public userInfo getuser(Integer id){
        if(userdata.containsKey(Integer.valueOf(id))) return userdata.get(id);
        else return null;
    }
    public List<userInfo> showAll(){
        List<userInfo> all = new ArrayList<>();
        for(Map.Entry<Integer , userInfo> data:userdata.entrySet()){
            all.add(data.getValue());
        }
        return all;
    }
    public List<eventInfo> showAllEvent(){
        List<eventInfo> allEvent = new ArrayList<>();
        for(Map.Entry<Integer,eventInfo> eventData:eventdata.entrySet()){
            allEvent.add(eventData.getValue());

        }
        return allEvent;
    }




}
