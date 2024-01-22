import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        float salario;
        float novoSalario = 0;
        String aumento; 

        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu salario ");
        salario = sc.nextFloat();

        if (salario > 0 && salario <= 3){
            novoSalario = (float) (salario + 0.2 * salario);
            aumento = " 20%";
        }else{
            if(salario >=4 && salario<=6 ){
                novoSalario = (float) (salario + salario * 0.15);
                aumento = " 15%";
            }else{
                if(salario >= 7 && salario <= 9){
                    novoSalario = (float) (salario + salario * 0.12);
                    aumento = " 12%";    
                }else{
                    if(salario >= 10 && salario <= 12){
                        novoSalario = (float) (salario + salario * 0.1);
                        aumento = " 10%";

                    }else{
                        if(salario > 12 && salario <= 15){
                            novoSalario = (float) (salario + salario * 0.07);
                            aumento = " 7%";
                        }else{
                            aumento = " 0%";
                            novoSalario = salario;
                        }
                            
                        }
                    }
                }
            }
    
            System.out.println(" O aumento foi de " + aumento + " salario atual e " + salario + " e o nocvo salario sera de " + novoSalario);
        } 
        }
    

