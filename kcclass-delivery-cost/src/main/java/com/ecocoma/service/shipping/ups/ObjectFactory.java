
package com.ecocoma.service.shipping.ups;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ecocoma.service.shipping.ups package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ecocoma.service.shipping.ups
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUPSRateResponse }
     * 
     */
    public GetUPSRateResponse createGetUPSRateResponse() {
        return new GetUPSRateResponse();
    }

    /**
     * Create an instance of {@link Shipping }
     * 
     */
    public Shipping createShipping() {
        return new Shipping();
    }

    /**
     * Create an instance of {@link GetExtendedUPSRateResponse }
     * 
     */
    public GetExtendedUPSRateResponse createGetExtendedUPSRateResponse() {
        return new GetExtendedUPSRateResponse();
    }

    /**
     * Create an instance of {@link GetUPSRate }
     * 
     */
    public GetUPSRate createGetUPSRate() {
        return new GetUPSRate();
    }

    /**
     * Create an instance of {@link GetExtendedUPSRate }
     * 
     */
    public GetExtendedUPSRate createGetExtendedUPSRate() {
        return new GetExtendedUPSRate();
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link Postage }
     * 
     */
    public Postage createPostage() {
        return new Postage();
    }

    /**
     * Create an instance of {@link ArrayOfPostage }
     * 
     */
    public ArrayOfPostage createArrayOfPostage() {
        return new ArrayOfPostage();
    }

}
