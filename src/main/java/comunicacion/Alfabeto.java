package comunicacion;

public abstract class Alfabeto extends Pictograma{

    private static String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private String interpretacion;

    public Alfabeto(String letras, String interpretacion){
        super();
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    public Alfabeto(){
        super();
    }

    public int cantidadLetras(){return Alfabeto.letras.size();}

    public String[] getLetras(){return Alfabeto.letras;}
    public void setLetras(String[] letras){Alfabeto.letras = letras;}

    public String getInterpretacion(){return this.interpretacion;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}

    @Override
    public String interpretacion(){return this.interpretacion;}

    @Override
    public String toString(){

        String msg = "";
        for (int i = 0; i < Alfabeto.letras.size(); i++){
            msg = msg + Alfabeto.letras[i] + ", ";
        }

        msg = msg + Alfabeto.letras[Alfabeto.letras.size() - 1];
        
        return msg;
    }
}