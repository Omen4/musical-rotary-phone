package com.example.mns_architecture_logicielle.maths;

public class Maths {

    public int multiplication (int a, int b){
        //Ecrire la méthode multiplication
        //Uniquement avec des additions
        //Tester par la suite
        int result = 0;
        boolean negatif = false;
        if (b<0){
            negatif = true;
            b = b * -1;
        }
        for (int i = 1 ; i <= b; i++){
            result+=a;
        }
        if(negatif){
            return result * -1;
        }

        return result;
    }

}
