package com.test;

public class Out {
    private class Inn{
       private void innerVoid(){
            System.out.println("innerVoid");
        }
    }

    private void outerVoid(){
        System.out.println("outerVoid");
    }

    public static void main(String[] args) {
        Out o = new Out();
        Inn oi = o.new Inn();
        o.outerVoid();
        oi.innerVoid();
    }
}
