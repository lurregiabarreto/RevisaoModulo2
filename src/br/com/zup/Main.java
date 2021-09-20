/* Crie um programa para gerenciar uma lista de produtos de um estabelecimento, cada produto tem um nome e um preço. No final do programa, o usuário deve decidir se irá adicionar mais de um produto, exibir todos os produtos cadastrados ou excluir um produto pelo nome.
 */

package br.com.zup;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        HashMap<String, Double > produtos = new HashMap<>();

        //Variaveis

        String nomeDoProduto;
        double valorDoProduto;
        int dados;
        Boolean menu = true;


        while (menu) {


            System.out.println("Digite a opção que deseja : ");
            System.out.println(" 0 - Voltar ao menu");
            System.out.println(" 1 - para adicionar mais um produto");
            System.out.println(" 2 - para exibir a lista de compra");
            System.out.println(" 3 - para excluir algum produto da lista de compra ");
            dados = leitor.nextInt();


            switch (dados) {
                case 1:
                    System.out.println("Por favor digite o nome do produto");
                    nomeDoProduto = leitor.next();
                    leitor.nextLine();

                    System.out.println("Por favor digite o valor do produto");
                    valorDoProduto = leitor.nextDouble();

                    System.out.println(nomeDoProduto+ " e R$" +valorDoProduto);


                    produtos.put(nomeDoProduto, valorDoProduto);
                    break;


                case 2:
                    if(produtos.isEmpty())
                        System.out.println("A lista está vazia, adicione algo ");

                    else{
                        System.out.println(produtos);
                    }

                    System.out.println("Para voltar ao menu, digite 0:");
                    dados = leitor.nextInt();
                    break;


                case 3:
                    System.out.println("Por favor insira o nome do produto que deseja excluir da lista");
                    nomeDoProduto = leitor.next();

                    if (produtos.containsKey(nomeDoProduto)) {
                        System.out.println("Produto removido da lista: \n" + produtos.get(nomeDoProduto));
                        produtos.remove(nomeDoProduto);
                    } else {
                        System.out.println("Este produto não se encontra na lista, por favor insira novamente");
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }
        }
    }
}