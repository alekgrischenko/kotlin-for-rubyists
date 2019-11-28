package org.spbrug.meetups.november2019.kotlin._misc;

import org.spbrug.meetups.november2019.kotlin.Customer;
import org.spbrug.meetups.november2019.kotlin.CustomerUtility;
import org.spbrug.meetups.november2019.kotlin.Status;

import static org.spbrug.meetups.november2019.kotlin.CustomerUtility.CopyrightYear;

public class _04_Interop {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Foo", Status.NEW);
        customer.changeStatus(Status.PENDING);

        System.out.println(CopyrightYear);

        CustomerUtility.extension(customer);

        try {
            customer.loadStatistics("");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
