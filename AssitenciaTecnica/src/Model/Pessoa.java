package Model;

public abstract class Pessoa {

    String id;
    String nome;
    String endereco;
    String cpf;
    String telefone;

    @Override
    public abstract Pessoa();

    @Override
    public abstract Pessoa();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void create(){

    }

    public void delete(){

    }

    public void list(){}

    public int findById(int a){
        return 0;
    }
    public String findByCpf(String cpf){
        return cpf;
    }

    public Boolean verifyExist(){
        return true;
    }
}

