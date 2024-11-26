import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Classe para representar uma pergunta
class Questao1 {
    private String questao;
    private List<String> alternativas;
    private String respostaCorreta;

    public Questao1(String questao, List<String> alternativas, String respostaCorreta) {
        this.questao = questao;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getQuestao() {
        return questao;
    }

    public List<String> getAlternativas() {
        return alternativas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }
}

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Apresentação do Quiz
        System.out.println("CENTRO UNIVERSITARIO ALFREDO NASSER");
        System.out.println();
        System.out.println("ALUNO: EDUARDO MARTINS");
        System.out.println();
        System.out.println("PROFESSOR: BRENNO PIMENTA");
        System.out.println();
        System.out.println("ATIVIDADE AVALIATIVA DE CONHECIMENTO HISTÓRICO GERAIS");
        System.out.println();
        System.out.println("NESTE QUESTIONÁRIO VOCÊ IRÁ RESPONDER 15 PERGUNTAS. É NECESSÁRIO DIGITAR O NÚMERO CORRESPONDENTE À ALTERNATIVA.");
        System.out.println();

        // Lista para armazenar as questaos
        List<Questao1> questaos = new ArrayList<>();
        List<Questao1> acertadas = new ArrayList<>();
        List<Questao1> erradas = new ArrayList<>();

        // Adicionar questaos
        questaos.add(new Questao1(
                "Qual é a civilização mais antiga do mundo?",
                List.of("Grécia", "Roma", "Winterfell", "Mesopotâmia", "Hogwarts"),
                "Mesopotâmia"
        ));

        questaos.add(new Questao1(
                "Em que ano começou a Primeira Guerra Mundial?",
                List.of("1914", "1918", "1939", "1945", "1899"),
                "1914"
        ));

        questaos.add(new Questao1(
                "Quem é o primeiro presidente dos Estados Unidos?",
                List.of("Obama", "Biden", "Bush", "Washington", "Trump"),
                "Washington"
        ));
        questaos.add(new Questao1(
                "A civilização asteca se originou de qual país??",
                List.of("Brasil", "México", "Peru", "Argentina", "Inglaterra"),
                "México"
        ));

        questaos.add(new Questao1(
                "Quem foi o primeiro homem a pisar na lua?",
                List.of("Yuri Gagarin", "Nicolau Flamel", "Alfred Worden", "Neil Armstrong", "Anatoli Berezovoy"),
                "Neil Armstrong"
        ));

        questaos.add(new Questao1(
                "Durante qual evento, a Coréia foi separada em 2 nações?",
                List.of("Segunda Guerra Mundial", "Primeira Guerra Mundial", "Guerra dos Bastardos", "Guerras Médicas", "Guerra de Troia"),
                "Segunda Guerra Mundial"
        ));

        questaos.add(new Questao1(
                "Qual é outro nome para a Grande Pirâmide do Egito?",
                List.of("Anúbis", "Gon", "Rá", "Jiro", "Gizé"),
                "Gizé"
        ));

        questaos.add(new Questao1(
                "Quem é o inventor da luz elétrica?",
                List.of("Albert Einstein", "Thomas Edison", "Nikola Tesla", "Marie Curie", "Charles Darwin"),
                "Thomas Edison"
        ));

        questaos.add(new Questao1(
                "Quando aconteceu a Guerra Fria?",
                List.of("1947-1991", "1912-1931", "1982-1998", "1960-1980", "1937-1959"),
                "1947-1991"
        ));

        questaos.add(new Questao1(
                "Em que oceano o Titanic afundou?",
                List.of("Oceano Antártico", "Oceano Ártico", "Oceano Índico", "Oceano Pacífico Norte", "Oceano Atlântico"),
                "Oceano Atlântico"
        ));

        questaos.add(new Questao1(
                "Quem fez o famoso discurso “Eu tenho um sonho”?",
                List.of("Martin Luther King Jr", "Abdias Nascimento", "Elaine Brown", "Malcom X", "Rosa Parks"),
                "Martin Luther King Jr"
        ));

        questaos.add(new Questao1(
                "Mona Lisa é uma pintura famosa de qual artista?",
                List.of("Rafael Sanzio", "Donato di Niccoló", "Leonardo Davinci", "Michelangelo di Lodovico", "Mestre Splinter"),
                "Leonardo Davinci"
        ));

        questaos.add(new Questao1(
                "Em qual cidade começou a Primeira Guerra Mundial?",
                List.of("Paris", "Sarajevo", "Istambul", "Berlim", "Mostar"),
                "Sarajevo"
        ));

        questaos.add(new Questao1(
                "Qual era o nome da agência de inteligência soviética?",
                List.of("ICBM", "DMZ", "SSI", "KGB", "DBZ"),
                "KGB"
        ));

        questaos.add(new Questao1(
                "Quanto tempo durou a guerra dos 100 anos?",
                List.of("100 anos", "116 anos", "95 anos", "103 anos", "99 anos"),
                "116 anos"
        ));


        // Contador de acertos
        int acertos = 0;

        // Iterar sobre as questaos
        for (Questao1 questao : questaos) {
            boolean respostaRegistrada = false;
            while (!respostaRegistrada) {
                // Exibir a questao
                System.out.println(questao.getQuestao());

                // Embaralhar alternativas
                List<String> alternativas = new ArrayList<>(questao.getAlternativas());
                Collections.shuffle(alternativas);

                // Exibir alternativas
                for (int i = 0; i < alternativas.size(); i++) {
                    System.out.println("[" + i + "] " + alternativas.get(i));
                }

                // Solicitar resposta do usuário
                System.out.print("Digite o número da sua resposta: ");
                String resposta = scanner.nextLine();

                try {
                    // Verificar a resposta
                    int respostaInt = Integer.parseInt(resposta);
                    if (respostaInt < 0 || respostaInt >= alternativas.size()) {
                        System.out.println("Número inválido. Tente novamente.");
                    } else {
                        String valorDaResposta = alternativas.get(respostaInt);
                        if (valorDaResposta.equals(questao.getRespostaCorreta())) {
                            System.out.println("Resposta correta!");
                            acertos++;
                            acertadas.add(questao);
                        } else {
                            System.out.println("Resposta errada! A resposta correta era: " + questao.getRespostaCorreta());
                            erradas.add(questao);
                        }
                        respostaRegistrada = true; // Passar para a próxima questao
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número correspondente à alternativa.");
                }
            }
        }

        // Exibir resultados
        System.out.println("\nRESULTADOS DO QUIZ:");
        System.out.println("Você acertou " + acertos + " de " + questaos.size() + " questaos.");
        double porcentagem = (acertos / (double) questaos.size()) * 100;
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", porcentagem) + "%");

        // Mostrar questaos acertadas
        System.out.println("\nPerguntas Acertadas:");
        for (Questao1 questao : acertadas) {
            System.out.println("- " + questao.getQuestao() + " (Resposta correta: " + questao.getRespostaCorreta() + ")");
        }

        // Mostrar questaos erradas
        System.out.println("\nPerguntas Erradas:");
        for (Questao1 questao : erradas) {
            System.out.println("- " + questao.getQuestao() + " (Resposta correta: " + questao.getRespostaCorreta() + ")");
        }

        scanner.close();
    }
}