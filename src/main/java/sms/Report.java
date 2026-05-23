/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author LEGION
 */
public class Report {
    //field
    private List<Transaction> transactions;
    private LocalDate date;

    public Report(List<Transaction> transactions, LocalDate date) {
        this.transactions = transactions;
        this.date = date;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
}
