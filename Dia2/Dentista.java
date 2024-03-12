package Dia2;

public class Dentista{

    private String nome;
    private int idade;

    public Dentista(String nome, int idade){
        this.nome = nome
        this.idade = idade
    }

    public String getNome(){
        return nome
    }

    public int getIdade(){
        return idade
    }

    public void setIdade(int idade){
        this.idade = idade
    }

    public void setNome(String nome){
        this.nome = nome
    }

    @Override
    public boolean equal(Object obj){
        if (this == obj)
            return true;

        if obj == null
            return false;
        
        if (getClass() != obj.getClass())
            return false

        Dentista other = (Carro) obj;

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
        result = prime * result + ((modelo == null) ? 0 : nome.hashCode());
        result = prime * result + ((modelo == null) ? 0 : idade.hashCode());
        return result;
    }

    @Override
    public String ToString(){
        return "{" +
        " nome='" + getNome() + "'" +
        " idade='" + getIdade() + "'" +
        "}" 
    }
}