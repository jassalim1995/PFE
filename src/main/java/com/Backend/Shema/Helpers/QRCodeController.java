package com.Backend.Shema.Helpers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRCodeController {
	
	public  String QR_CODE_IMAGE_PATH ;

	
    @GetMapping(value = "/genrateAndDownloadQRCode/{name}/{codeText}/{width}/{height}")
		public void download(
				@PathVariable("name") String name,
				@PathVariable("codeText") String codeText,
				@PathVariable("width") Integer width,
				@PathVariable("height") Integer height)
			    throws Exception {
    			QR_CODE_IMAGE_PATH = "./src/main/resources/Qrcodes/"+name+".png";
			        QRCodeGenerator.generateQRCodeImage(codeText, width, height, QR_CODE_IMAGE_PATH);
			    }

    @GetMapping(value = "/genrateQRCode/{codeText}/{width}/{height}")
   	public ResponseEntity<byte[]> generateQRCode(
   			@PathVariable("codeText") String codeText,
   			@PathVariable("width") Integer width,
   			@PathVariable("height") Integer height)
   		    throws Exception {
   		        return ResponseEntity.status(HttpStatus.OK).body(QRCodeGenerator.getQRCodeImage(codeText, width, height));
   		    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

