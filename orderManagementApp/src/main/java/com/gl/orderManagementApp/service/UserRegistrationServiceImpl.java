package com.gl.orderManagementApp.service;

import com.gl.orderManagementApp.dto.SellerDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
    Logger logger = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);
    private RestTemplate restTemplate;

    public UserRegistrationServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String registerSeller(SellerDto sellerDto) {
        String response = restTemplate.postForObject("https://localhost:8086/registration/addSeller", sellerDto, String.class);
        return response;
    }

    public List<SellerDto> getSellersList() {
        return restTemplate.getForObject("https://localhost:8086/registration/sellersList", List.class);
    }

}
