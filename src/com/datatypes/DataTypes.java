package com.datatypes;

public class DataTypes {


    public void printAllDataTypes(){
        byte byteEx= 127;
        System.out.println("byteEx : "+byteEx);
        System.out.println("Max val : "+Byte.MAX_VALUE);
        System.out.println("Min val "+Byte.MIN_VALUE);


        short shortEx = 32345;
        System.out.println("  value : "+shortEx);
        System.out.println("Max val : "+Short.MAX_VALUE);
        System.out.println("Min val "+Short.MIN_VALUE);

        int num1 = 2345;
        System.out.println("  value : "+num1);
        System.out.println("Max val : "+Integer.MAX_VALUE);
        System.out.println("Min val "+Integer.MIN_VALUE);


        long longEx = 98765432123L;
        System.out.println("  value : "+longEx);
        System.out.println("Max val : "+Long.MAX_VALUE);
        System.out.println("Min val "+Long.MIN_VALUE);

        float floatEx = 2345.45f;
        System.out.println("  value : "+floatEx);
        System.out.println("Max val : "+Float.MAX_VALUE);
        System.out.println("Min val "+Float.MIN_VALUE);

        double doubleEx = 124356.45;
        System.out.println("  value : "+doubleEx);
        System.out.println("Max val : "+Double.MAX_VALUE);
        System.out.println("Min val "+Double.MIN_VALUE);

        boolean booleanEx = true;
        System.out.println("  value : "+booleanEx);


        char charEx = 'W';
        System.out.println("charEx value : "+charEx);
    }
}
