package com.spring.irctc.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInfo {
private Long pnr;
private String tname;
private String status;
}
