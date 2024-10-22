package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Tüm kullanıcıları getir
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // ID'ye göre kullanıcı getir
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    // Yeni kullanıcı ekle veya var olanı güncelle
    public User save(User user) {
        return userRepository.save(user);
    }

    // ID'ye göre kullanıcı sil
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
