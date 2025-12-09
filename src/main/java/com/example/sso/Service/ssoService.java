package com.example.sso.Service;

import com.example.sso.Entity.ssoUserEntity;
import com.example.sso.Repository.ssoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Service
public class ssoService {
    @Autowired
    public ssoRepository ssoRepository;
    public List<ssoUserEntity> getAll() {
        return ssoRepository.findAll();
    }



    public ssoUserEntity Create(ssoUserEntity ssoUserEntity) {
        try {
            if (ssoUserEntity.getTokenId() == null || ssoUserEntity.getTokenId().trim().isEmpty()) {
                ssoUserEntity.setTokenId("");
            }
            if (ssoUserEntity.getRequestDate() == null) {
                ssoUserEntity.setRequestDate(new Timestamp(System.currentTimeMillis()));
            }
            return ssoRepository.save(ssoUserEntity);
        } catch (Exception e) {
             return null;
        }

    }
}