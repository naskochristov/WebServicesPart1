package com.scalefocus.trainings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2015-11-12T08:45:41.181+01:00
 * Generated source version: 3.1.3
 * 
 */
@WebService(targetNamespace = "http://trainings.scalefocus.com", name = "UploadFileService")
@XmlSeeAlso({ObjectFactory.class})
public interface UploadFileService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "uploadFile", targetNamespace = "http://trainings.scalefocus.com", className = "com.scalefocus.trainings.UploadFile")
    @WebMethod
    @ResponseWrapper(localName = "uploadFileResponse", targetNamespace = "http://trainings.scalefocus.com", className = "com.scalefocus.trainings.UploadFileResponse")
    public java.lang.String uploadFile(
        @WebParam(name = "arg0", targetNamespace = "")
        com.scalefocus.trainings.FileUpload arg0
    );
}
