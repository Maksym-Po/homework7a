package ua.ithillel.lms;

public class Main {

    public static void main(String[] args) {

        Car carCard0 = new Car();
        carCard0.marka = "Audi";
        carCard0.mod = "A6";
        carCard0.year = 2021;
        carCard0.color = "Black";
        carCard0.cost = 50000;
        carCard0.number = 15;

        Car carCard1 = new Car();
        carCard1.marka = "Audi";
        carCard1.mod = "A8";
        carCard1.year = 2022;
        carCard1.color = "White";
        carCard1.cost = 150000;
        carCard1.number = 5;

        Car carCard2 = new Car();
        carCard2.marka = "Seat";
        carCard2.mod = "Leon";
        carCard2.year = 2022;
        carCard2.color = "Blut";
        carCard2.cost = 30000;
        carCard2.number = 2;

        Client client1 = new Client();
        client1.name = "aaaa";
        client1.years = 36;
        client1.many = 111000;
        client1.Credit = true;
        client1.hcredit = false;
      //  boolean b = client1.years >= 18;
        if (client1.years >= 18) {
            if (client1.many > carCard0.cost) {
                System.out.println();
                System.out.println("WIN");

            } else if (client1.hcredit == true) {
                System.out.println("Credit");

            } else if (client1.Credit == true) {
                System.out.println("ful Credit");
            }

            } else
                System.out.println("GHB rju 18");

        }
    }




