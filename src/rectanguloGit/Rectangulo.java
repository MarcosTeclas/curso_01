package rectanguloGit;

public class Rectangulo {
	
 private double alto;
 private double ancho;
 
 public Rectangulo(double alto, double ancho) 
 {
	 this.ancho=ancho;
	 this.alto=alto;
 }
 
 public double perimetro() 
 {
	 return this.ancho*2 + this.alto*2;
 }

@Override
public String toString() {
	return "Rectangulo [alto=" + alto + ", ancho=" + ancho + "]";
}
 
 public double area() 
 {
	 return this.alto*this.alto;
 }

}
