/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.*;
import Controller.*;
import java.util.*;

public class Principal {
 public static void main (String[] args) {
    ArrayList<Pessoa>pessoas = new ArrayList<>();
    ArrayList<Automovel>automoveis = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int opc;
    do{
        System.out.println("1 - Cadastrar Pessoa\n2 - Cadastrar Automovel\n3 - Criar Aluguel\n4 - Sair");
        opc = sc.nextInt();
        switch(opc){
            case 1:
                System.out.println(" 1 - Funcionario\n2 - Cliente ");
               int opcc = sc.nextInt();
               if(opcc == 1){
                   Funcionario func = new Funcionario();
            System.out.println(" Insira o Nome: ");
            func.setNome(sc.next());
            System.out.println(" Insira o CPF: ");
            func.setCpf(sc.next());
            System.out.println(" Insira o Sexo: ");
            func.setSexo(sc.next());
            System.out.println(" Insira o Salário ");
            func.setSalario(sc.nextFloat());
            System.out.println(" Digite o ID do funcionario ");
            func.setIdentificador(sc.next());
            pessoas.add(func);
break;
               }else if (opcc == 2){
            Cliente cli = new Cliente(); 
            System.out.println(" Insira o Nome: ");
            cli.setNome(sc.next());
            System.out.println(" Insira o CPF: ");
            cli.setCpf(sc.next());
            System.out.println(" Digite o RG do Cliente ");
            cli.setRg(sc.next());
            System.out.println(" Insira o Sexo ");
            cli.setSexo(sc.next());
            System.out.println(" Digite o ID do Cliente ");
            cli.setId_cliente(sc.next());
                pessoas.add(cli);
break;
                    }
 break;
            case 2:
                System.out.println(" 1 - Carro\n2 - Caminhão ");
                int opca = sc.nextInt();
                if(opca == 1){
                    Carro car = new Carro();
                    System.out.println(" Insira a Capacidade do veiculo: ");
                    car.setCapacidade(sc.nextInt());
                    System.out.println(" Insira a Potencia do veiculo: ");
                    car.setPotencia(sc.nextInt());
                    System.out.println(" Insira o Modelo: ");
                    car.setModelo(sc.next());
                    System.out.println(" Insira a Placa ");
                    car.setPlaca(sc.next());
                    System.out.println(" Digite a Marca do Veiculo ");
                    car.setMarca(sc.next());
                    automoveis.add(car);
            break;
                }else if(opca == 2){ 
                  Caminhao cam = new Caminhao();
            System.out.println(" Insira a Capacidade de Carga do veiculo: ");
            cam.setCapacidade_carga(sc.nextInt());
            System.out.println(" Insira o total de eixos do veiculo: ");
            cam.setNum_eixos(sc.nextInt());
            System.out.println(" Insira o Modelo: ");
            cam.setModelo(sc.next());
            System.out.println(" Insira a Placa ");
            cam.setPlaca(sc.next());
            System.out.println(" Digite a Marca do Veiculo ");
            cam.setMarca(sc.next());
            automoveis.add(cam);
            break;
        }
            break;
            case 3:
                ArrayList <AluguelDeAutomovel> aluguel = new ArrayList();
             System.out.println( Arrays.toString( pessoas.toArray()));
             System.out.println( Arrays.toString( automoveis.toArray()));
            
        GerarAluguel gerar = new GerarAluguel();
        
        gerar.setCliente((Cliente)pessoas.get(sc.nextInt()));
        gerar.setAutomovel((Carro)automoveis.get(sc.nextInt()));
        aluguel.add((AluguelDeAutomovel) gerar.tipoDeAluguel());
        System.out.println( Arrays.toString( aluguel.toArray()));
        
break;
                        
        }
        
    }while(opc != 4);
 }   
}
