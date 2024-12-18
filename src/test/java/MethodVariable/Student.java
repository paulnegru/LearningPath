package MethodVariable;

import org.testng.annotations.Test;

public class Student {

    //clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice
    //intr-un fisier java putem avea mai multe clase diferentiate pe baza numelui(nu este un practice bun sa avem mai multe clase cu acelasi nume)
    //intr-o clasa putem defini proprietatile si actiunile entitatii

    //variabila = proprietatea unei clase
    //variabilele pot sa fie de 2 feluri: globale si locale
    //variabilele globale = sunt vizibile peste tot in proiect
    //variabilele locale = sunt vizibile doar in locul unde sunt declarate
    //ca sa definim o variabila locala: accesscontrol (public, etc.) tip_variabila nume_variabila
    //in momentul cand definesti o variabila nu este obligatoriu sa ii dam o valoare

    //metoda = actiunea unei clase
    //exista 2 tipuri de metode: void si return


    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean Are_Diploma;


    @Test
    public void prezentareStudent(){
        Nume = "Negru";
        Prenume = "Paul";
        Varsta = 26;
        Adresa = "Libertatii";
        Inaltime = 1.90;
        Greutate = 108.4F;
        Sex = 'M';
        Are_Diploma = true;

//        System.out.println(Nume + " " + Prenume + " " + Varsta + " " + Adresa);
//        System.out.print(Inaltime + " " + Greutate + " " + Sex + " " + Are_Diploma);

        System.out.println("Numele studentului este: " + Nume + " " + Prenume);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Inaltime studentului este: " + Inaltime);
        System.out.println("Greutate studentului este: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Are diploma studentul? " + Are_Diploma);


        calculMedie();
    }

    public void calculMedie(){
        Integer nota1 = 7;
        Integer nota2 = 4;
        Integer nota3 = 8;
        Integer medie = (nota1 + nota2 + nota3)/3;
        System.out.println("Media studentului este: " + medie);
    }

}
