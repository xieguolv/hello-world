package com.example.kfit;

import com.example.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInfoRepository extends MongoRepository<User,String>{
    User findById(String Id);
    User findByUsernameAndPassword(String username,String password);
    User findByCountnumberAndPassword(String countnumber,String password);
}
