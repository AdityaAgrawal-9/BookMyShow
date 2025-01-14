package com.example.bookmyshow.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@Builder
public class BookTicketResponseDto {
    private String showName;
    private List<Long> seatIds;
    private double amount;
    private String theatreName;
    private Long bookingReference;
}
