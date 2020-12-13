package com.stockApp.Application.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class StockExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    
    String stockExchange, brief, contactAddress, remarks;
 
}
