package Dia1;

public class Veiculo{
    private String marca;
    private Integer ano;

    public Veiculo(String marca, Integer ano){
        this.marca = marca;
        this.ano = ano;
    }

    public Veiculo(){
        this.marca = "";
        this.ano = 0;
    }

    public Veiculo(String marca){
        this.marca = marca;
        this.ano = 0;
    }

    public String getMarca(){
        return marca;
    }

    public Void setMarca(String marca){
        this.marca = marca;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    @Override
    public boolean equal(Object obj){
        if (this == obj)
            return true;

        if obj == null
            return false;
        
        if (getClass() != obj.getClass())
            return false

        Veiculo other = (Veiculo) obj;

        if(marca = null){
            if (other.marca != null)
            return false
        }
        else if(!marca.equals(other.marca))
            return false

        if(ano = null){
            if (other.ano != null)
            return false
        }
        else if(!ano.equals(other.ano))
            return false
    }

    @Override
    public int hashCode(){
        private int prime = 31;
        private result = 1;
        result = prime * result + ((modelo == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : ano.hashCode());
        return result;
    }
}