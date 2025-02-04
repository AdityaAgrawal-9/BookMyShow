package com.example.bookmyshow.service;

import com.example.bookmyshow.exception.SeatNotFoundException;
import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.ShowSeatStatus;
import com.example.bookmyshow.repository.BookingRepository;
import com.example.bookmyshow.repository.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final ShowSeatRepository showSeatRepository;
    private final BookingRepository bookingRepository;

    public TicketService(ShowSeatRepository showSeatRepository, BookingRepository bookingRepository) {
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
    }

    public Booking book(List<Long> showSeatIds) {

        List<ShowSeat> showSeatList = showSeatRepository.findAllById(showSeatIds);

        if (showSeatIds.size() != showSeatList.size()) {
            throw new SeatNotFoundException();
        }

        double amount = 0;
        for(ShowSeat showSeat : showSeatList) {
            if(showSeat.getShowSeatStatus() != ShowSeatStatus.AVAILABLE){
                throw new IllegalArgumentException("Seats unavailable");
            }
            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
            amount += showSeat.getPrice();
        }
        showSeatRepository.saveAll(showSeatList);
        Booking booking = Booking.builder()
                .amount(amount)
                .showSeatList(showSeatList)
                .show(showSeatList.get(0).getShow())
                .build();

        bookingRepository.save(booking);
        return booking;
    }
}
