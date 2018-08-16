package com.financialmarket.service;

import com.financialmarket.model.FinancialModelingPrep.Company;

import java.util.List;

public interface IFinancialModelingPrepService {

    Company getAnnualFinancialIncomeStatements(String ticker);

    List<Company> getAnnualFinancialIncomeStatements(List<String> tickers);
}
