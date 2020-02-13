package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Information {
    List<String> getInformations(String name) {
        List<String> list = new ArrayList<>();

        switch (name) {
            case "Saif":
                list.add("Contact no: 0124 211 225");
                list.add("Address: Khilkhet, Dhaka");
                break;

            case "Zahin":
                list.add("Contact no: 1456 114 111");
                list.add("Address: Motijhil, Dhaka");
                break;

            case "Faysal":
                list.add("Contact no: 01674 144 250");
                list.add("Address: Uttara, Dhaka");
                break;

            case "Neephat":
                list.add("Contact no: 0175 147 852");
                list.add("Address: Hili, Tetulia");
                break;

        }
        return list;
    }
}
