package com.geekster.Room.App.repo;

import com.geekster.Room.App.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepo extends CrudRepository<Room, Integer> {


    List<Room> findByRoomPrice(double price);

   // List<Room> findByRoomPriceLessThenEqualAndRoomAvailable(double price, boolean b);

    
    List<Room> findByRoomPriceLessThanEqualAndRoomAvailable(double price, boolean b);

    List<Room> findByRoomPriceLessThanEqualOrRoomAvailable(double price, boolean b);
}
