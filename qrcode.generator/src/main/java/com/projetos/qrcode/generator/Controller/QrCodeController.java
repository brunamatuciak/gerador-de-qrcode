package com.projetos.qrcode.generator.Controller;


import com.projetos.qrcode.generator.dto.qrcode.QrCodeGenerateRequest;
import com.projetos.qrcode.generator.dto.qrcode.QrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request){
        return null;

    }
}
