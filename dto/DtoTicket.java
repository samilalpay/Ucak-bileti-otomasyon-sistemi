package com.samilemir.dto;

import java.math.BigDecimal;

import com.samilemir.enums.CurrencyType;
import com.samilemir.enums.TicketStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoTicket {
    private String seatNumber;
    private BigDecimal amount;
    private String pnrCode;
    private CurrencyType currencyType;
    private TicketStatus ticketStatus;
    private DtoPassenger passenger;
}
