package com.aju.soapserviceemail.service;

public class EmailServiceImplProxy implements com.aju.soapserviceemail.service.EmailServiceImpl {
  private String _endpoint = null;
  private com.aju.soapserviceemail.service.EmailServiceImpl emailServiceImpl = null;
  
  public EmailServiceImplProxy() {
    _initEmailServiceImplProxy();
  }
  
  public EmailServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmailServiceImplProxy();
  }
  
  private void _initEmailServiceImplProxy() {
    try {
      emailServiceImpl = (new com.aju.soapserviceemail.service.EmailServiceImplServiceLocator()).getEmailServiceImpl();
      if (emailServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)emailServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)emailServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (emailServiceImpl != null)
      ((javax.xml.rpc.Stub)emailServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.aju.soapserviceemail.service.EmailServiceImpl getEmailServiceImpl() {
    if (emailServiceImpl == null)
      _initEmailServiceImplProxy();
    return emailServiceImpl;
  }
  
  public com.aju.soapserviceemail.bean.EmailStatus getEmailOperation(com.aju.soapserviceemail.bean.EmailData emailData) throws java.rmi.RemoteException{
    if (emailServiceImpl == null)
      _initEmailServiceImplProxy();
    return emailServiceImpl.getEmailOperation(emailData);
  }
  
  
}