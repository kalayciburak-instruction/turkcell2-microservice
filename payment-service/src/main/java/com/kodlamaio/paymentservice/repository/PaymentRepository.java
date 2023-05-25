package com.kodlamaio.paymentservice.repository;

import com.kodlamaio.paymentservice.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {
    boolean existsByCardNumber(String cardNumber);
    Payment findByCardNumber(String cardNumber);
    boolean existsByCardNumberAndCardHolderAndCardExpirationYearAndCardExpirationMonthAndCardCvv(
            String cardNumber,
            String holderName,
            int cardExpirationYear,
            int cardExpirationMonth,
            String cvv
    );

    // SPeL -> Spring Expression Language
    /*
    @Query(
            "SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END " +
                    "FROM Payment p WHERE p.cardNumber = :#{request.cardNumber}" +
                    "AND p.cardHolder = :#{request.cardHolder} "
    )
    boolean existsByCardNumberAndCardHolderAndCardExpirationYearAndCardExpirationMonthAndCardCvv(
            @Param("request") PaymentRequest request
    );
    */
}
