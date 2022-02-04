package com.example.demo.User;

class UserNotFoundException extends RuntimeException {

    UserNotFoundException(Long id) {
      super("Could not find employee " + id);
    }
  }
