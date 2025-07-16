package com.projetos.qrcode.generator.Controller;


import com.projetos.qrcode.generator.Service.QrCodeGeneratorService;
import com.projetos.qrcode.generator.dto.qrcode.QrCodeGenerateRequest;
import com.projetos.qrcode.generator.dto.qrcode.QrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeService) {
        this.qrCodeGeneratorService = qrCodeService;
    }


    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request){
       try {
           QrCodeGenerateResponse response = this.qrCodeGeneratorService.generateAndUploadQrCode(request.text());
                   return ResponseEntity.ok(response);
       } catch (Exception e){
           return ResponseEntity.internalServerError().build();
       }

    }
}
