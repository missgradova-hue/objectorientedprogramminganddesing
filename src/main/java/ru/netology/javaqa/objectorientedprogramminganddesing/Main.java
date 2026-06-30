//package ru.netology.javaqa.objectorientedprogramminganddesing;
//
//public class Main {
//    public static void main(String[] args) {
//        Radio radio = new Radio();
//
//        radio.currentVolume = 5;
//        radio.currentStation = 8;
//
//        System.out.println(radio.currentVolume);
//        System.out.println(radio.currentStation);
//
//        int currentVolume =0;
//
//        for (int i = 0; i <= 100; i++) {
//            if (i >= 100) {
//                currentVolume = 100;
//            } else {
//                currentVolume = i;
//            }
//
//            System.out.println("i = " + i);
//        }
//
//        int currentDecreaseVolume;
//        for (int b = 100; b >= 0; b--) {
//            if (b < 0) {
//                currentVolume = 0;
//            } else {
//                currentVolume = b;
//
//            }
//            System.out.println("b = " + b);
//        }
//
//        int currentStation = 0;
//        int nextCurrentStation;
//
//        for (int a = 0; a <= 9; a++) {
//            if (a > 9) {
//                currentStation = 0;
//            } else {
//                currentStation = a;
//            }
//
//            System.out.println("a = " + a);
//        }
//
//        int previousCurrentStation;
//
//        for (int c = 9; c >= 0; c--) {
//            if (c < 0) {
//                currentStation = 9;
//            } else {
//                currentStation = c;
//            }
//
//            System.out.println("c = " + c);
//        }
//    }
//
//}