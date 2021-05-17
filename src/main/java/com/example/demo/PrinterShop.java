package com.example.demo;

public class PrinterShop {
    /*
        For a Printer Shop we have 3 printer types to sell
            1. printer with wifi, color, fax
            2. printer with B/W, scan, fax
            3. Printer with wifi, color, B/W scan and fax
     */
    public static void main(String[] args) {
        Printer1 printer1 = new Printer1();
        printer1.WifiSupport();
        printer1.colorPrintSupport();
        printer1.faxSupport();
        Printer2 printer2 = new Printer2();
        printer2.colorPrintSupport();
        printer2.scannerSupport();
        printer2.faxSupport();
        Printer3 printer3 = new Printer3();
        printer3.WifiSupport();
        printer3.colorPrintSupport();
        printer3.scannerSupport();
        printer3.faxSupport();
    }
}

class Printer1 implements Wifi,ColorPrint,Fax{

    @Override
    public void WifiSupport() {
        System.out.println("Printer 1: Wifi");
    }

    @Override
    public void colorPrintSupport() {
        System.out.println("Printer 1: ColoPrint");
    }

    @Override
    public void faxSupport() {
        System.out.println("Printer 1: Fax");
    }
}

class Printer2 implements ColorPrint, Scanner, Fax{

    @Override
    public void colorPrintSupport() {
        System.out.println("Printer 2: Black and White");
    }

    @Override
    public void scannerSupport() {
        System.out.println("Printer 2: Scanner");

    }

    @Override
    public void faxSupport() {
        System.out.println("Printer 2: Fax");
    }
}

class Printer3 implements Wifi, ColorPrint, Scanner, Fax{

    @Override
    public void WifiSupport() {
        System.out.println("Printer 3: Wifi");
    }

    @Override
    public void colorPrintSupport() {
        System.out.println("Printer 3: Color or Black and White Printing");
    }

    @Override
    public void scannerSupport() {
        System.out.println("Printer 3: Scanner");
    }

    @Override
    public void faxSupport() {
        System.out.println("Printer 3: Fax");
    }
}

interface Wifi{
    void WifiSupport();
}

interface ColorPrint{
    void colorPrintSupport();
}

interface BandW{
    void bandwidthSupport();
}

interface Scanner{
    void scannerSupport();
}

interface Fax{
    void faxSupport();
}