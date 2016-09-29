package com.scalefocus.trainings;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService(targetNamespace="http://trainings.scalefocus.com", serviceName="UploadFile")
@MTOM(enabled=true)
public class UploadFileService {

	
	public String uploadFile(FileUpload file)
	{
		DataHandler handler = file.getFileData();
		try {
			InputStream is = handler.getInputStream();
			OutputStream os = new FileOutputStream(new File("C:/upload/target/" + file.getFileName() + "." + file.getFileType()));
			
			byte[] b = new byte[5000];
			int bytesRead=is.read(b);
			
			while(bytesRead != -1)
			{
				//System.out.println("Bytes read: " +  bytesRead);
				os.write(b,0, bytesRead);
				bytesRead=is.read(b);
			}
			os.flush();
			os.close();
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "File uploaded";
	}
	
}
