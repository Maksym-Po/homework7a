package ua.ithillel.lms;

public class Main {

    public static void main(String[] args) {

        Car carCard1 = new Car();
        carCard1.marka = "Audi";
        carCard1.mod = "A8";
        carCard1.year = 2022;
        carCard1.color = "White";
        carCard1.cost = 15000;
        carCard1.number = 5;

        Client client1 = new Client();
        client1.name = "Alex Smith";
        client1.years = 26;
        client1.many = 11000;
        client1.Credit = false;
        client1.hcredit = true;

        if (client1.years >= 18) {

            if (client1.many > carCard1.cost) {
                System.out.println();
                System.out.println("Уважаемый клиент " +client1.name+ " ВЫ купили авто "+ carCard1.marka +carCard1.mod+" год выпуска"+ carCard1.year);

            } else if (client1.hcredit == true) {
                int d = carCard1.cost- client1.many;
                System.out.println(  "Уважаемый клиент "+client1.name+ " вы оформили кредит на сумму " +d);
                System.out.println(" ВЫ купили авто "+ carCard1.marka +carCard1.mod+" год выпуска"+ carCard1.year);
            } else if (client1.Credit == true) {
                System.out.println("Уважаемый клиент "+client1.name+ " вы оформили кредит на сумму полной стоимости асто" + carCard1.cost);
                System.out.println( " ВЫ купили авто "+ carCard1.marka +carCard1.mod+" год выпуска"+ carCard1.year);
            }
        } else
            System.out.println("Уважаемый клиент "+client1.name+ "приходите когда  вам будет 18 лет");
    }
}




