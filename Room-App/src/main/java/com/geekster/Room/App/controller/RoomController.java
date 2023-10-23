package com.geekster.Room.App.controller;

import com.geekster.Room.App.model.Room;
import com.geekster.Room.App.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;
    //post Api
    @PostMapping("room")

    public String addRoom(@RequestBody Room newRoom){

        return roomService.addRoom(newRoom);
    }

    //add multiple rooms at once

    @PostMapping("newRooms")
    public String addRooms(@RequestBody List<Room> newRooms){
        return roomService.addRooms(newRooms);
    }


    //Get Api
    @GetMapping("rooms")
    public List<Room> getRoom(){

        return roomService.getRoom();
    }

    @GetMapping("rooms/id/{id}")
    public Room getRoomById(@PathVariable Integer id){

        return roomService.getRoomById(id);
    }

    @GetMapping("rooms/price/{price}")
    public List<Room> getRoomByPrice(@PathVariable double price){

        return roomService.getRoomByPrice(price);
    }

    @GetMapping("rooms/price/{price}/and/available")
    public List<Room> getAvailableRoomsBelowPrice(@PathVariable double price)
    {
        return roomService.getAvailableRoomsBelowPrice(price);
    }

    @GetMapping("rooms/price/{price}/or/available")
    public List<Room> getAvailableRoomsOrBelowPrice(@PathVariable double price)
    {
        return roomService.getAvailableRoomsOrBelowPrice(price);
    }

    @DeleteMapping("rooms/ids")
    public String removeRoomsById(@RequestBody List<Integer> ids){
        return roomService.removeRoomsByIds(ids);
    }


}
