public class EcuacionSegundoGrado {
    private double a, b, c, x1, x2;
    public EcuacionSegundoGrado(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        solucionar();
    }
    public void setA(double a){
        this.a = a;
        solucionar();
    }
    public void setB(double b){
        this.b = b;
        solucionar();
    }
    public void setC(double c){
        this.c = c;
        solucionar();
    }
    private void solucionar(){
        if (a != 0){
            this.x1 = ( -b + Math.sqrt( Math.pow(b, 2) - (4*a*c) ) ) / (2*a);
            this.x2 = ( -b - Math.sqrt( Math.pow(b, 2) - (4*a*c) ) ) / (2*a);

        }
        else {
            this.x1 = 0;
            this.x2 = 0;
        }
    }
    public double getX1(){
        return x1;
    }
    public double getX2(){
        return x2;
    }


}


