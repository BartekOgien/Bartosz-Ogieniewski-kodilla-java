package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public final class Facade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> findCompanyBySubstring(final String substring) {
        List<Company> resultCompanies = companyDao.retrieveCompanyNameByArg(substring);
        if(resultCompanies.size() == 0) {
            LOGGER.warn("No companies found where name contains: " + substring);
            return new ArrayList<>();
        }
        else {
            LOGGER.info("Found companies: ");
            resultCompanies.stream()
                    .map(company -> company.getName())
                    .forEach(companyname -> LOGGER.info(companyname));
            return resultCompanies;
        }
    }

    public List<Employee> findEmployeesBySubstring(final String substring) {
        List<Employee> employeeList = employeeDao.retrieveEmployersBySubstring(substring);
        if(employeeList.size() == 0) {
            LOGGER.warn("No employees found where lastname contains: " + substring);
            return new ArrayList<>();
        }
        else {
            LOGGER.info("Found employees: ");
            employeeList.stream()
                    .map(e -> e.getLastname())
                    .forEach(e -> LOGGER.info(e));
            return employeeList;
        }
    }
}
