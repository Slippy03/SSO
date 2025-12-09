package com.example.sso.Controller;

import com.example.sso.Entity.ssoUserEntity;
import com.example.sso.Service.ssoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/service")
public class ssoUserController {

    @Autowired
    private ssoService ssoService;

    @GetMapping("/getAll")
    public List<ssoUserEntity> getAllSsoUsers() {
        return ssoService.getAll();
    }

    @PostMapping("/gentoken")
    public ResponseEntity<?> createSsoUser(@RequestBody ssoUserEntity ssoUserEntity) {
        try {
            if (ssoUserEntity.getUserId() == null || ssoUserEntity.getUserId().isBlank() || ssoUserEntity.getTokenId() == null || ssoUserEntity.getTokenId().isBlank()) {
                Map<String, Object> errorResponse = response("E0000001", "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้", ssoUserEntity.getUserId(), "");
                return ResponseEntity.badRequest().body(errorResponse);
            }

            ssoUserEntity createdUser = ssoService.Create(ssoUserEntity);
            Map<String, Object> successResponse = response("I07000", "บันทึกข้อมูลลงฐานข้อมูลเรียบร้อย", createdUser.getUserId(), createdUser.getTokenId());
            return ResponseEntity.status(HttpStatus.OK).body(successResponse);

        } catch (Exception e) {
            Map<String, Object> errorResponse = response("500", "ไม่พบฐานข้อมูล หรือ Database connect ไม่ได้" , null, null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    private Map<String, Object> response(String code, String message, String userId, String tokenId) {
        Map<String, Object> responseData = Map.of(
                "userId", userId != null ? userId : "",
                "tokenId", tokenId != null ? tokenId : ""
        );
        return Map.of("code", code, "message", message, "data", responseData);
    }
}
