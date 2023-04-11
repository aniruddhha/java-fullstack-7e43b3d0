package com.ani.soap.exception;

import javax.xml.namespace.QName;

import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

import com.ani.soap.gen.ServiceStatus;

public class GlobalExceptionHandler extends SoapFaultMappingExceptionResolver {
    
    private static final QName CODE = new QName("statusCode");
	private static final QName MESSAGE = new QName("message");

    @Override
    protected void customizeFault(Object endpoint, Exception ex, SoapFault fault) {

        System.out.println("-------> Got Error ");
        if(ex instanceof ServiceFaultException) {
            System.out.println("❌ It is service");
            ServiceStatus sts = ((ServiceFaultException)ex).getStatus();

            SoapFaultDetail detail = fault.getFaultDetail();

            detail.addFaultDetailElement(CODE).addText("This is custom Exception "+ sts.getStatusCode());
            detail.addFaultDetailElement(MESSAGE).addText("This is custom Exception "+ sts.getMessage());
        }
    }
    
}
