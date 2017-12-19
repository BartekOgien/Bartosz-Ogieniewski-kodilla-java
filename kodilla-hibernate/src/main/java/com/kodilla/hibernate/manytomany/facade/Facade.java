package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public final class Facade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompanyBySubstring(final String substring) {
        List<Company> resultCompanies = companyDao.retrieveCompanyNameByArg(substring);
        if(resultCompanies.size() == 0) {
            log.warn("No companies found where name contains: " + substring);
            return resultCompanies;
        }
        else {
            log.info("Found companies: ");
            resultCompanies.stream()
                    .map(company -> company.getName())
                    .forEach(companyname -> log.info(companyname));
            return resultCompanies;
        }
    }

    public List<Employee> findEmployeesBySubstring(final String substring) {
        List<Employee> employeeList = employeeDao.retrieveEmployersBySubstring(substring);
        if(employeeList.size() == 0) {
            log.warn("No employees found where lastname contains: " + substring);
            return new ArrayList<>();
        }
        else {
            log.info("Found employees: ");
            employeeList.stream()
                    .map(e -> e.getLastname())
                    .forEach(e -> log.info(e));
            return employeeList;
        }
    }
}
