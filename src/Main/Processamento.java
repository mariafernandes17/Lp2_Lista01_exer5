
package Main;

/**
 *
 * @author maria
 */
class Processamento {
    private double nota1;
    private double nota2;
    private double nota3;
    private String resultado;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
   
    public void getMaiorNota(){
        double aux;
        if(nota2>nota1){
            aux = nota1;
            nota1 = nota2;
            nota2 = aux;
            
        }
        if (nota3>nota2){
            aux = nota2;
            nota2 = nota3;
            nota3 = aux;
        }
        if(nota2>nota1){
            aux = nota1;
            nota1 = nota2;
            nota2 = aux;
        }
    }
    
    public String getResultado(){
        double resposta = (nota1*4+nota2*3+nota3*3)/10;
        if (resposta<60){
            return "Reprovado";
          
        }
        else{
            return "Aprovado";
        }
            
            
    }
    
}
