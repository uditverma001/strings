package com.strings;

public class StringsPlay {

    public static void main(String[] args) {
        String s = "sachin";
        String s2 = new String("verma");

        String s3 = "verma";

        String s4 = s3;
        String s5 = "deaa39e16b2cf20f8cd7d232a1306344f04020e1f0fb28d35492606f647a60fe729cc40d3cba33e093a17aed41bd161fe1240556d0f1b80e773abd408686217e";
        String s6 = "deaa39e16b2cf20f8cd7d232a1306344f04020e1f0fb28d35492606f647a60fe729cc40d3cba33e093a17aed41bd161fe1240556d0f1b80e773abd408696217e";


        System.out.println("condition1 ::: " + s5.hashCode());

        System.out.println("condition2 ::: " + s6.hashCode());

        System.out.println("condition3 ::: " + (s2 == s4));

        System.out.println("condition4 ::: " + (s3 == s4));

        System.out.println("condition5 ::: " + (s2 == s4));

        System.out.println("condition6 ::: " + (s2.equals(s4)));



        /*System.out.println("condition1 ::: "+(s2==s3));

        System.out.println("condition2 ::: "+(s2.equals(s3)));

        System.out.println("condition3 ::: "+(s2==s4));

        System.out.println("condition4 ::: "+(s3==s4));

        System.out.println("condition5 ::: "+(s2==s4));

        System.out.println("condition6 ::: "+(s2.equals(s4)));


        */

    }
}
