package com.example.sso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sso.Entity.ssoUserEntity;
import java.sql.Time;

@Repository
public interface ssoRepository extends JpaRepository<ssoUserEntity, Time> {}
