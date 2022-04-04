package com.solvd.hierarchy;

import com.solvd.hierarchy.exception.IncorrectOperationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Main {
    private static Logger LOGGER = LogManager.getLogger(Main.class);


    public static void main(String args[]) {
        int typePeople = 1;

        String firstName = "Guillermo";
        String lastName = "Subeldia";

        //Example Client 1/

        Scanner scanner = new Scanner(System.in);
        Client p = new Client(firstName, lastName);
        Service s = new Service();
        Credit c = new Credit();
        Card cards = new Card();
        BankAccount b = new BankAccount();
        Employee emp = new Employee();

        //set the data
        p.setTypePeople(typePeople);
        LOGGER.info("Please select the service you want to use:");
        LOGGER.info("1 - Home Banking:");
        LOGGER.info("2 - Credit/Debit Card");
        LOGGER.info("3 - Client|Staff");

        int optionSelected = scanner.nextInt();

        try {
            switch (optionSelected) {
                case 1:
                    //Going to do some home banking
                    s.Service(firstName, lastName, typePeople, optionSelected);
                    break;
                case 2:
                    LOGGER.info("1- To check the amount of money of our credit have to offer.");
                    LOGGER.info("2- To see the status of your cards");
                    int newOption = scanner.nextInt();
                    if (newOption == 1) {
                        c.Credit(firstName, lastName, b.getBalance());
                    } else {
                        cards.Card(firstName, lastName);
                    }
                    break;
                case 3:
                    LOGGER.info("\nThis is a list of employees of the bank");
                    emp.getEmployeeList().forEach((name, area) -> LOGGER.info(name + " its in charge of: " + area));
                    LOGGER.info("\nThis is a our principal customer in " + emp.getCompanyName());
                    LOGGER.info(p.getFullName());
                    break;
                default:
                    throw new IncorrectOperationException();
            }
        } catch (IncorrectOperationException e) {
            LOGGER.info(e.getMessage());
        }
    }


}





