package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "job search")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "London", "10 miles", "35000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in London"},
                {"Teaching Assistant", "London", "5 miles", "20000", "35000", "Per annum", "Permanent", "Permanent Teaching Assistant jobs in London"},
                {"Teacher", "London", "5 miles", "35000", "40000", "Per annum", "Permanent", "Permanent Teacher jobs in London"},
                {"Retail Assistant", "London", "5 miles", "18000", "22000", "Per annum", "Permanent", "Permanent Retail Assistant jobs in London"},
                {"Dentist Nurse", "London", "5 miles", "25000", "35000", "Per annum", "Permanent", "Permanent Dentist Nurse jobs in London"},
                {"Receptionist ", "London", "5 miles", "20000", "25000", "Per annum", "Permanent", "Permanent Receptionist jobs in London"},
                {"Nurse", "London", "10 miles", "25000", "35000", "Per annum", "Permanent", "Permanent Nurse jobs in London"},
        };

        return data;
    }
}
