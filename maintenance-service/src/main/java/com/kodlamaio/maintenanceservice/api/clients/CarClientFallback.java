package com.kodlamaio.maintenanceservice.api.clients;

import com.kodlamaio.commonpackage.utils.dto.ClientResponse;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CarClientFallback implements CarClient {

    @Override
    public ClientResponse checkIfCarAvailable(UUID carId) {
        throw new RuntimeException("SERVER IS DOWN");
    }
}
