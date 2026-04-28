package com.aprendizado;

public class Calculadora {
    public int somar(int a, int b) { return a + b; }
    public int subtrair(int a, int b) { return a - b; }
    public int multiplicar(int a, int b) { return a * b; }
    public double dividir(int a, int b) { return (double) a / b; }
    public boolean ehPositivo(int n) { return n >= 0; }
}