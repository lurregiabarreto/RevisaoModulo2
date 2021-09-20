/* Crie um programa para gerenciar uma lista de candidatos de um vestibular, cada candidato tem número de matrícula e uma nota. No final do programa, o usuário deve decidir se irá adicionar mais de um candidato, exibir todos os candidatos cadastrados ou excluir um candidato pelo número de matrícula.*/

package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Map<String, String> alunos = new HashMap<String, String>();
        Scanner leitor = new Scanner(System.in);

        boolean repeticao = true;
        int menu = 0;

        System.out.println("--- Candidatos 2021 ---");

        while (repeticao) {

            System.out.println("Para se inscrever no vestibular digite 1");
            System.out.println("Para exibir lista de alunos matriculados digite 2");
            System.out.println("Para excluir candidato digite 3");
            menu = leitor.nextInt();
            leitor.nextLine();

            if (menu == 1) {
                System.out.println("Por favor digite seu nome completo:");
                String nomeDoAluno = leitor.nextLine();
                System.out.println("Por favor digite o seu número de matricula:");
                String numeroDeMatricula = leitor.nextLine();
                System.out.println("Por favor digite sua média:");
                String mediaDeAluno = leitor.nextLine();

                System.out.println("Aluno cadastrado com sucesso!!!");
                alunos.put(numeroDeMatricula, mediaDeAluno);
            } else if (menu == 2) {
                for (String vestibulandos : alunos.keySet()) {
                    System.out.println("Todos os alunos cadastrados: ");
                    System.out.println("Número da Matrículo:" + vestibulandos + "\n Media: " + alunos.get(vestibulandos));
                }
            } else if (menu == 3) {
                System.out.println("Para excluir candidato digite o número da sua matrícula:");
                String excluirCandidato = leitor.nextLine();
                alunos.remove(excluirCandidato);
                System.out.println("Candidato Excluido!!!");
            } else {
                System.out.println("Digite um valor valido!");
            }
        }
    }
}
