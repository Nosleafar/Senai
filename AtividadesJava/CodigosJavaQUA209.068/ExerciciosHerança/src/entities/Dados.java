package entities;

public class Dados {
    private String funcionario;
    private int idade;
    private String cargo;
    protected double salario;
    private double bonus;

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void dadosFuncionario() {
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        
        if (cargo.equals("DIRETOR") || cargo.equals("PRESIDENTE") || cargo.equals("ENCARREGADO")) {
            System.out.println("Salario: " + salario + "\n" + "Salário com Bônus: " + (salario + getBonus()));
        } else {
            System.out.println("Salário: " + salario);
        }
    }
}