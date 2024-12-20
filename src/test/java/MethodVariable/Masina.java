package MethodVariable;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest(){
        dateMasina("Audi", "RS7", 2023);
        dateMasina("BMW", "M5", 2020);

        calculMedie(8.2 , 6.8);
        calculMedie(5.4 , 9.8);
    }


    public void dateMasina(String param1, String param2, Integer param3){
        marca = param1;
        model = param2;
        anFabricatie = param3;

        //System.out.println(marca + " " + model + " " + anFabricatie);
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("An de fabricatie: " + anFabricatie);

    }

    //Calculam media la 2 numere
    public void calculMedie(Double nr1, Double nr2){
        Double medie = (nr1 + nr2) / 2;
        System.out.println("Media este: " + medie);
    }

}
