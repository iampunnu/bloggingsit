package com.project.boggingsite.users;
import com.project.boggingsite.user.UserEntity;
import com.project.boggingsite.user.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UsersRepositoryTest {
    @Autowired
    UserRepository userRepository;
    @Test
    public void createUser(){
        UserEntity userEntity=new UserEntity();
        userEntity.setBio("test user bio");
        userEntity.setUsername("testuser");
        userEntity.setEmail("tst@email.com");
        userEntity.setPassword("passowrd");
        userRepository.save(userEntity);
        UserEntity userEntity1=userRepository.findByEmail("tst@email.com");
        System.out.println("use entity is "+userEntity1.toString());
        Assertions.assertNotNull(userEntity1.getId());
    }
}
