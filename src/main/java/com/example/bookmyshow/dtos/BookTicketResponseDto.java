package com.example.bookmyshow.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class BookTicketResponseDto {
    private String showName;
    private List<Long> seatIds;
    private double amount;
    private String theatreName;
    private Long bookingReference;
}
