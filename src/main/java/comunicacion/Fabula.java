package comunicacion;

public class Fabula extends Escrito{

    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int param){return param * super.getPaginas();}

    @Override
    public String interpretacion(){return this.interpretacion;}

    @Override
    public String toString(){
        return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.ensenanzas;
    }

    public String getEnsenanzas(){return this.ensenanzas;}
    public void setEnsenanzas(String ensenanzas){this.ensenanzas = ensenanzas;}

    public String getInterpretacion(){return this.interpretacion;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}
}
