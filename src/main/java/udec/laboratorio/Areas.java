package udec.laboratorio;

import javax.swing.JOptionPane;

public class Areas {
    private double base, altura, radio, areaCuadrado, areaCirculo;

    public Areas() {
    }

    public Areas(double base, double altura, double radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public void imprimirAreas(){
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + calcularAreaCuadrado());
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + calcularAreaCirculo());
    }
    
    public double recibirDatos(String mensaje){
        double valor = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return valor;
    }

    private double calcularAreaCuadrado(){
        areaCuadrado = base * altura;
        return areaCuadrado;
    }

    private double calcularAreaCirculo(){
        areaCirculo = Math.PI * Math.pow(radio, 2);
        return areaCirculo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
