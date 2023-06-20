package com.bruce.shardingjdbcdemo.service.impl;

import com.bruce.shardingjdbcdemo.dto.UserDTO;
import com.bruce.shardingjdbcdemo.entity.UserEntity;
import com.bruce.shardingjdbcdemo.mapper.UserMapper;
import com.bruce.shardingjdbcdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;

    @Override
    public List<UserDTO> queryAllUser() {
       List<UserEntity> entityList = userMapper.queryAllUser() ;
       if(CollectionUtils.isEmpty(entityList)){
           return null ;
       }
       List<UserDTO> userDTOList = new ArrayList<>() ;
       BeanUtils.copyProperties(userDTOList,entityList);
       return userDTOList ;
    }
}
