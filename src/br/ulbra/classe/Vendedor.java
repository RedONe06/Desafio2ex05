package br.ulbra.classe;

public class Vendedor {
    
    private String nome;
    private double meta;
    private double totalVendido;
    
    public Vendedor(){
        //Método construtor
    }
    
    //Getters
    public String getNome(){
        return nome;
    }
    public double getMeta(){
        return meta;
    }
    public double getTotalVendido(){
        return totalVendido;
    }
    
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMeta(double meta){
        this.meta = meta;
    }
    public void setTotalVendido(double totalVendido){
        this.totalVendido = totalVendido;
    }
    
    public double calcularComissao(double valorVendido){
        if (valorVendido/meta < 0.5){
            return (valorVendido * 0.01);
        } else if (valorVendido/meta >= 0.5 && valorVendido/meta <= 0.75){
            return(valorVendido * 0.025);
        } else if (valorVendido/meta >= 0.751 && valorVendido/meta <= 1){
            return(valorVendido * 0.035);
        } else {
            return (valorVendido * 0.05);
        }
    }    
}
 
   
   
    
