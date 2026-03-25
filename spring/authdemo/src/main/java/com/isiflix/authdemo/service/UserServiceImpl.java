package com.isiflix.authdemo.service;

import com.isiflix.authdemo.dto.LoginDTO;
import com.isiflix.authdemo.model.User;
import com.isiflix.authdemo.repository.UserRepository;
import com.isiflix.authdemo.security.IsiToken;
import com.isiflix.authdemo.security.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository repo;

    @Override
    public User create(User usuario) {
        // TODO Auto-generated method stub
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String novaSenha = encoder.encode(usuario.getPassword());
        usuario.setPassword(novaSenha);
        return repo.save(usuario);
    }

    @Override
    public IsiToken login(LoginDTO dto) {
        // TODO Auto-generated method stub
        User res = repo.findByLogin(dto.login());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (encoder.matches(dto.password(), res.getPassword())) {
            return TokenUtil.encode(res);
        }
        return null;
    }
}