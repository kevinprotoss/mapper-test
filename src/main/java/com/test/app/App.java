package com.test.app;

import com.gta.qts.c2j.adaptee.structure.SSEL2_Quotation;
import com.nodeunify.jupiter.commons.mapper.DatastreamMapper;
import com.nodeunify.jupiter.datastream.v1.Quote;

public class App {
    public String getCode() {
        Quote quote = Quote.newBuilder().setCode("600200").build();
        return quote.getCode();
    }

    public static void main(String[] args) {
        SSEL2_Quotation quotation = new SSEL2_Quotation();
        quotation.TotalNo = 31313;
        Quote quote = DatastreamMapper.MAPPER.map(quotation);
        System.out.println(quote.getNumTrades());
    }
}
