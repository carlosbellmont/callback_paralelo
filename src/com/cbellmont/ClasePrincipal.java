package com.cbellmont;

interface Callback {
    void iterationDone(int iteration, String threadName, int sleepingTime);
}

public class ClasePrincipal implements Callback {

    String output1 = "";
    String output2 = "";
    String output3 = "";
    String output4 = "";
    String output5 = "";

    int contadorOutput1 = 0;
    int contadorOutput2 = 0;
    int contadorOutput3 = 0;
    int contadorOutput4 = 0;
    int contadorOutput5 = 0;


    final int maxNumThread = 10;

    public ClasePrincipal(){

        for (int i = 0; i < maxNumThread; i++){
            Dormilon t = new Dormilon(this);
            t.setName("Hilo " + i);
            t.start();
        }

    }



    @Override
    public void iterationDone(int iteration, String threadName, int sleepingTime)  {

        String s = "El " + threadName + " ha dormido por " + sleepingTime + " milisengundos\n";
        switch (iteration){
            case 0 : {
                output1 = output1 + s;
                contadorOutput1++;
                if (contadorOutput1 == maxNumThread){
                    System.out.println("ITERACION 1");
                    System.out.println(output1);
                }
                break;
            }
            case 1 : {
                output2 = output2 + s;
                contadorOutput2++;
                if (contadorOutput2 == maxNumThread){
                    System.out.println("ITERACION 2");
                    System.out.println(output2);
                }
                break;
            }
            case 2 : {
                output3 = output3 + s;
                contadorOutput3++;
                if (contadorOutput3 == maxNumThread){
                    System.out.println("ITERACION 3");
                    System.out.println(output3);
                }
                break;
            }
            case 3 : {
                output4 = output4 + s;
                contadorOutput4++;
                if (contadorOutput4 == maxNumThread){
                    System.out.println("ITERACION 4");
                    System.out.println(output4);
                }
                break;
            }
            case 4 : {
                output5 = output5 + s;
                contadorOutput5++;
                if (contadorOutput5 == maxNumThread){
                    System.out.println("ITERACION 5");
                    System.out.println(output5);
                }
                break;
            }
        }
    }
}
