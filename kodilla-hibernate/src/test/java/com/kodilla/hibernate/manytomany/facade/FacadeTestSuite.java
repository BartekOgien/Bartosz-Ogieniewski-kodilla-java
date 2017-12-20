package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    Facade facade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testFacade() {
        //Given
        Company company1 = new Company("Kodilla");
        Company company2 = new Company("Bodzzilla");
        Company company3 = new Company("Lakodzilla");
        Employee employee1 = new Employee("Zenek", "Kowalskii");
        Employee employee2 = new Employee("Antek", "malyszskii");
        Employee employee3 = new Employee("Ziutek", "Kowalsky");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        int id1 = company1.getId();
        int id2 = company2.getId();
        int id3 = company3.getId();
        int id4 = employee1.getId();
        int id5 = employee2.getId();
        int id6 = employee3.getId();

        //When
        List<Company> companyList = facade.findCompanyBySubstring("kod");
        List<Employee> employeeList = facade.findEmployeesBySubstring("ski");

        //Then
        try {
            Assert.assertEquals(2, companyList.size());
            Assert.assertEquals(2, employeeList.size());
        }

        //Cleanup
        finally {
            companyDao.delete(id1);
            companyDao.delete(id2);
            companyDao.delete(id3);
            employeeDao.delete(id4);
            employeeDao.delete(id5);
            employeeDao.delete(id6);
        }
    }
}
