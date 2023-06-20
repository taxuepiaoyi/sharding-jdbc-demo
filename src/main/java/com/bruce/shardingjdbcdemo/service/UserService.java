package com.bruce.shardingjdbcdemo.service;

import com.bruce.shardingjdbcdemo.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> queryAllUser() ;
}
