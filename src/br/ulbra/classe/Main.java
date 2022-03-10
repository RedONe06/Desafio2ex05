package br.ulbra.classe;

// @author Andriele Joras dos Santos
// 09/03/2022 - Noturno

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Vendedor vendedor = new Vendedor();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o nome do vendedor:");
        vendedor.setNome(input.nextLine());
        
        System.out.println("Informe a sua meta:");
        vendedor.setMeta(input.nextDouble());
        
        System.out.println("Informe o total vendido:");
        vendedor.setTotalVendido(input.nextDouble());
        
        double comissao = vendedor.calcularComissao(vendedor.getTotalVendido());
        
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Meta: " + vendedor.getMeta());
        System.out.println("Comissão: " + comissao);
        
        
        
        
        
        
        
        
        
    }
    
}
