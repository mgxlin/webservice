
package com.lhb.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WsService", targetNamespace = "http://ws.lhb.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ws", targetNamespace = "http://ws.lhb.com", className = "com.lhb.ws.Ws")
    @ResponseWrapper(localName = "wsResponse", targetNamespace = "http://ws.lhb.com", className = "com.lhb.ws.WsResponse")
    public String ws(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
