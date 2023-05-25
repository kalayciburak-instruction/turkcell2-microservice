package com.kodlamaio.maintenanceservice.api.clients;

import com.kodlamaio.commonpackage.utils.dto.ClientResponse;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name = "INVENTORY-SERVICE", fallback = CarClientFallback.class)
public interface CarClient {

    @GetMapping(value = "/api/cars/check-car-available/{carId}")
    @Retry(name = "retry-maintenance")
    ClientResponse checkIfCarAvailable(@PathVariable UUID carId);
}
