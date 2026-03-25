package com.isiflix.authdemo.service;

import com.isiflix.authdemo.dto.LoginDTO;
import com.isiflix.authdemo.model.User;
import com.isiflix.authdemo.security.IsiToken;

public interface IUserService {

    public User create(User usuario);
    public IsiToken login(LoginDTO dto);
}