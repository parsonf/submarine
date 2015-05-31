package com.parsonf.submarine;

public class Submarine implements Runnable {

    private SubmarineClassicGUI classicGUI;


    public void run() {
        System.out.println("working.");

        classicGUI = new SubmarineClassicGUI(this);
    }

    /**
     * The main() method.
     *
     * @param args Arguments sent to the program (ignored)
     */
    public static void main(String[] args) {
        (new Thread(new Submarine())).start();
    }
}

