package com.example;

public class Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, insira dois números inteiros como parâmetros.");
            return;
        }

        try {
            int primeiroNumero = Integer.parseInt(args[0]);
            int segundoNumero = Integer.parseInt(args[1]);

            if (primeiroNumero > segundoNumero) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira valores inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}

        
        

              

        


    

