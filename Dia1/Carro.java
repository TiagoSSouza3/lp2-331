package Dia1;

public class Carro extends Veiculo{
    private String modelo;
    private String placa;

    public Carro(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    public Carro(){
        this.modelo = "";
        this.placa = "";
    }

    public Carro(String modelo){
        this.modelo = "";
    }

    @Override
    public boolean equal(Object obj){
        if (this == obj)
            return true;

        if obj == null
            return false;
        
        if (getClass() != obj.getClass())
            return false

        Carro other = (Carro) obj;

        if(modelo = null){
            if (other.modelo != null)
            return false
        }
        else if(!modelo.equals(other.modelo))
            return false

        if(placa = null){
            if (other.placa != null)
            return false
        }
        else if(!placa.equals(other.placa))
            return false
    }

    @Override
    public int hashCode(){
        private int prime = 31;
        private result = 1;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((modelo == null) ? 0 : placa.hashCode());
        return result;
    }
}