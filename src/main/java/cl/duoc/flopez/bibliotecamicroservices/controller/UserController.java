package cl.duoc.flopez.bibliotecamicroservices.controller;

import cl.duoc.flopez.bibliotecamicroservices.model.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {
// Simulación de base de datos en memoria
    private final Map<Long, User> users = new HashMap<Long, User>();
    private Long nextId = 1L;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User userRequest) {
        User user = new User(nextId++, userRequest.getName(), userRequest.getEmail(), LocalDate.now());
        users.put(user.getId(), user);
        return ResponseEntity.status(201).body(user);
    }

    // GetMapping General sin ID
    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        if (users.isEmpty()) {
            Map<String, Object> error = new HashMap<String, Object>();
            error.put("status", 404);
            error.put("error", "Not Found");
            error.put("message", "No hay usuarios registrados");
            error.put("path", "/api/users");
            return ResponseEntity.status(404).body(error);
        }
        return ResponseEntity.ok(users.values());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        User user = users.get(id);
        if (user == null) {
            Map<String, Object> error = new HashMap<String, Object>();
            error.put("status", 404);
            error.put("error", "Not Found");
            error.put("message", "Usuario no existe");
            error.put("path", "/api/users/" + id);
            return ResponseEntity.status(404).body(error);
        }
        return ResponseEntity.ok(user);
    }
}
