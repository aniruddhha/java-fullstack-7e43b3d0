package com.ani.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ani.soap.exception.ServiceFaultException;
import com.ani.soap.gen.Country;
import com.ani.soap.gen.Currency;
import com.ani.soap.gen.GetCountryRequest;
import com.ani.soap.gen.GetCountryResponse;
import com.ani.soap.gen.ServiceStatus;

@Endpoint
public class CountryEndpoint {
    
    private static final String NAMESPACE_URI = "http://soap.ani.com/gen";

    @PayloadRoot(
        namespace = NAMESPACE_URI,
        localPart = "getCountryRequest"
    )
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {

        if(request.getName().isEmpty()) {
            ServiceStatus sts = new ServiceStatus();
            sts.setMessage("name cant be empty");
            sts.setStatusCode("400");
            throw new ServiceFaultException("Bad Request Data ", sts );
        }

        Country country = new Country();
        country.setName(request.getName());
        country.setCapital("aaa");
        country.setCurrency(Currency.EUR);
        country.setPopulation(100);

        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(country);

        return response;
    }
}
