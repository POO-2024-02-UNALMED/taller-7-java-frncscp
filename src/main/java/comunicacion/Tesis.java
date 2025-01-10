package comunicacion;
public class Tesis extends Escrito{

    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){

        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;

    }

    @Override
    public int palabrasTotales(int param){return param * 5 * super.getPaginas();}

    @Override
    public String interpretacion(){return this.interpretacion;}

    @Override
    public String toString(){
        return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.idea + "\n" + this.argumentos.length + "\n" + this.conclusion + "\n" + this.referencias + "\n" + this.interpretacion;
    }

    public String getIdea(){return this.idea;}
    public void setIdea(String idea){this.idea = idea;}

    public String[] getArgumentos(){return this.argumentos;}
    public void setArgumentos(String[] argumentos){this.argumentos = argumentos;}

    public String getConclusion(){return this.conclusion;}
    public void setConclusion(String conclusion){this.conclusion = conclusion;}

    public String getReferencias(){return this.referencias;}
    public void setReferencias(String referencias){this.referencias = referencias;}

    public String getInterpretacion(){return this.interpretacion;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}

}
