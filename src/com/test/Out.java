package com.test;

public class Out {
    private class Inn{
       private void innerVoid(){
            System.out.println("innerVoid");
        }
        private class InnInner{
           private void innerInnerVoid(){
               System.out.println("innerInnerVoid");
           }
        }
    }

    private void outerVoid(){
        System.out.println("outerVoid");
    }

    public static void main(String[] args) {
        Out o = new Out();
        Inn oi = o.new Inn();
//        Out.Inn oi2 = new Out.new Inn(); так не получится создать
        o.outerVoid();
        oi.innerVoid();

        Inn.InnInner i3 = oi.new InnInner(); //ссылка 3 уровня
//      Inn.InnInner i4 = Out.Inn.InnInner(); ТАК НЕ ПОЛУЧИТСЯ СОЗДАТЬ
        i3.innerInnerVoid();


    }
}
