package comunicacion;

public class Periodico {

    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(){return 10 * super.getPaginas();}
    
    @Override
    public String interpretacion(){return this.interpretacion;}

    @Override
    public String toString(){
        return super.getOrigen + "\n" + super.getTitulo + "\n" + super.getAutor + "\n" + super.getPaginas + "\n" + this.fecha + "\n" + this.primicia;
    }

    public String getFecha(){return this.fecha;}
    public void setFecha(String fecha){this.fecha = fecha;}

    public String getPrimicia(){return this.primicia;}
    public void setPrimicia(String primicia){this.primicia = primicia;}

    public String getInterpretacion(){return this.interpretacion;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}

}
