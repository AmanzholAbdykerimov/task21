package com.company;

import java.util.Scanner;

import static com.company.Days.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Days days = Days.Monday;
        System.out.print("Kerek bolgon kundu anglis tilinde bash tamga menen tuura jaz  ---->  ");
        String a=scanner.nextLine();
        for(Days s:Days.values()){
            if(a.equals(s.name())){
            System.out.println(s.getInfo());
        }
    }
}}
/*Кундорго enum тузунуз (Monday, Tuesday ...)
консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо - анда
        "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
        Жуманын кундорун кыргыз тилинде корсотунуз.*/