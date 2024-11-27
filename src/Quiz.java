import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resp;
        int cont = 0;

        // Apresentação do Quiz
        System.out.println("CENTRO UNIVERSITARIO ALFREDO NASSER");
        System.out.println();
        System.out.println("ALUNO: EDUARDO  INACIO MARTINS");
        System.out.println();
        System.out.println("PROFESSOR: BRENNO PIMENTA");
        System.out.println();
        System.out.println("ALGORITMO E PROGRAMAÇÃO II");
        System.out.println();
        System.out.println("NESTE QUESTIONÁRIO VOCÊ IRÁ RESPONDER 15 PERGUNTAS. É NECESSÁRIO DIGITAR APENAS A LETRA CORRESPONDENTE À ALTERNATIVA.");
        System.out.println();

        // Lista para armazenar todas as questões
        List<Questao> questaos = new ArrayList<>();

        // Adicionar questões

        Questao q1 = new Questao();
        q1.pergunta = "(Questão 1) Qual é a civilização mais antiga do mundo?";
        q1.opcaoA = " a) Roma";
        q1.opcaoB = " b) Winterfell";
        q1.opcaoC = " c) Hogwarts";
        q1.opcaoD = " d) Mesopotâmia";
        q1.opcaoE = " e) Grécia";
        q1.correta = "d";
        q1.escrevaQuestao();
        resp = q1.leiaResposta();
        if (q1.isCorreta(resp)) cont++;

        Questao q2 = new Questao();
        q2.pergunta = "(Questão 2)Em que ano começou a Primeira Guerra Mundial?";
        q2.opcaoA = " a) 1914";
        q2.opcaoB = " b) 1918";
        q2.opcaoC = " c) 1939";
        q2.opcaoD = " d) 1945";
        q2.opcaoE = " e) 1899";
        q2.correta = "a";
        q2.escrevaQuestao();
        resp = q2.leiaResposta();
        if (q2.isCorreta(resp)) cont++;

        Questao q3 = new Questao();
        q3.pergunta = "(Questão 3) Quem é o primeiro presidente dos Estados Unidos?";
        q3.opcaoA = " a) Obama";
        q3.opcaoB = " b) Biden";
        q3.opcaoC = " c) Bush";
        q3.opcaoD = " d) Washington";
        q3.opcaoE = " e) Trump";
        q3.correta = "d";
        q3.escrevaQuestao();
        resp = q3.leiaResposta();
        if (q3.isCorreta(resp)) cont++;

        Questao q4 = new Questao();
        q4.pergunta = "(Questão 4) A civilização asteca se originou de qual país?";
        q4.opcaoA = " a) Brasil";
        q4.opcaoB = " b) México";
        q4.opcaoC = " c) Peru";
        q4.opcaoD = " d) Argentina";
        q4.opcaoE = " e) Inglaterra";
        q4.correta = "b";
        q4.escrevaQuestao();
        resp = q4.leiaResposta();
        if (q4.isCorreta(resp)) cont++;

        Questao q5 = new Questao();
        q5.pergunta = "(Questão 5) Quem foi o primeiro homem a pisar na lua?";
        q5.opcaoA = " a) Yuri Gagarin";
        q5.opcaoB = " b) Nicolau Flamel";
        q5.opcaoC = " c) Alfred Worden";
        q5.opcaoD = " d) Neil Armstrong";
        q5.opcaoE = " e) Anatoli Berezovoy";
        q5.correta = "d";
        q5.escrevaQuestao();
        resp = q5.leiaResposta();
        if (q5.isCorreta(resp)) cont++;

        Questao q6 = new Questao();
        q6.pergunta = "(Questão 6) Durante qual evento, a Coréia foi separada em 2 nações?";
        q6.opcaoA = " a) Segunda Guerra Mundial";
        q6.opcaoB = " b) Primeira Guerra Mundial";
        q6.opcaoC = " c) Guerra dos Bastardos";
        q6.opcaoD = " d) Guerras Médicas";
        q6.opcaoE = " e) Guerra de Troia";
        q6.correta = "a";
        q6.escrevaQuestao();
        resp = q6.leiaResposta();
        if (q6.isCorreta(resp)) cont++;

        Questao q7 = new Questao();
        q7.pergunta = "(Questão 7) Qual é outro nome para a Grande Pirâmide do Egito?";
        q7.opcaoA = " a) Anúbis";
        q7.opcaoB = " b) Gon";
        q7.opcaoC = " c) Rá";
        q7.opcaoD = " d) Jiro";
        q7.opcaoE = " e) Gizé";
        q7.correta = "e";
        q7.escrevaQuestao();
        resp = q7.leiaResposta();
        if (q7.isCorreta(resp)) cont++;

        Questao q8 = new Questao();
        q8.pergunta = "(Questão 8) Quem é o inventor da luz elétrica?";
        q8.opcaoA = " a) Albert Einstein";
        q8.opcaoB = " b) Thomas Edison";
        q8.opcaoC = " c) Nikola Tesla";
        q8.opcaoD = " d) Marie Curie";
        q8.opcaoE = " e) Charles Darwin";
        q8.correta = "b";
        q8.escrevaQuestao();
        resp = q8.leiaResposta();
        if (q8.isCorreta(resp)) cont++;

        Questao q9 = new Questao();
        q9.pergunta = "(Questão 9) Quando aconteceu a Guerra Fria?";
        q9.opcaoA = " a) 1947-1991";
        q9.opcaoB = " b) 1912-1931";
        q9.opcaoC = " c) 1982-1998";
        q9.opcaoD = " d) 1960-1980";
        q9.opcaoE = " e) 1937-1953";
        q9.correta = "a";
        q9.escrevaQuestao();
        resp = q9.leiaResposta();
        if (q9.isCorreta(resp)) cont++;

        Questao q10 = new Questao();
        q10.pergunta = "(Questão 10)  Em que oceano o Titanic afundou?";
        q10.opcaoA = " a) Oceano Antártico";
        q10.opcaoB = " b) Oceano Ártico";
        q10.opcaoC = " c) Oceano Índico";
        q10.opcaoD = " d) Oceano Pacífico Norte";
        q10.opcaoE = " e) Oceano Atlântico";
        q10.correta = "e";
        q10.escrevaQuestao();
        resp = q10.leiaResposta();
        if (q10.isCorreta(resp)) cont++;

        Questao q11 = new Questao();
        q11.pergunta = "(Questão 11) Quem fez o famoso discurso “Eu tenho um sonho”?";
        q11.opcaoA = " a) Martin Luther King Jr";
        q11.opcaoB = " b) Abdias Nascimento";
        q11.opcaoC = " c) Elaine Brown";
        q11.opcaoD = " d) Malcom X";
        q11.opcaoE = " e) Rosa Parks";
        q11.correta = "a";
        q11.escrevaQuestao();
        resp = q11.leiaResposta();
        if (q11.isCorreta(resp)) cont++;

        Questao q12 = new Questao();
        q12.pergunta = "(Questão 12) Mona Lisa é uma pintura famosa de qual artista?";
        q12.opcaoA = " a) Rafael Sanzio";
        q12.opcaoB = " b) Donato di Niccoló";
        q12.opcaoC = " c) Leonardo Da Vinci";
        q12.opcaoD = " d) Michelangelo di Lodovico";
        q12.opcaoE = " e) Mestre Splinter";
        q12.correta = "c";
        q12.escrevaQuestao();
        resp = q12.leiaResposta();
        if (q12.isCorreta(resp)) cont++;

        Questao q13 = new Questao();
        q13.pergunta = "(Questão 13) Em qual cidade começou a Primeira Guerra Mundial?";
        q13.opcaoA = " a) Paris";
        q13.opcaoB = " b) Sarajevo";
        q13.opcaoC = " c) Istambul";
        q13.opcaoD = " d) Berlim";
        q13.opcaoE = " e) Mostar";
        q13.correta = "b";
        q13.escrevaQuestao();
        resp = q13.leiaResposta();
        if (q13.isCorreta(resp)) cont++;

        Questao q14 = new Questao();
        q14.pergunta = "(Questão 14) Qual era o nome da agência de inteligência soviética?";
        q14.opcaoA = " a) ICBM";
        q14.opcaoB = " b) DMZ";
        q14.opcaoC = " c) SSI";
        q14.opcaoD = " d) KGB";
        q14.opcaoE = " e) DBZ";
        q14.correta = "d";
        q14.escrevaQuestao();
        resp = q14.leiaResposta();
        if (q14.isCorreta(resp)) cont++;

        Questao q15 = new Questao();
        q15.pergunta = "(Questão 15) Quanto tempo durou a guerra dos 100 anos?";
        q15.opcaoA = " a) 100 anos";
        q15.opcaoB = " b) 116 anos";
        q15.opcaoC = " c) 95 anos";
        q15.opcaoD = " d) 103 anos";
        q15.opcaoE = " e) 99 anos";
        q15.correta = "b";
        q15.escrevaQuestao();
        resp = q15.leiaResposta();
        if (q15.isCorreta(resp)) cont++;

        // Adicionar mais questões conforme a estrutura acima...
        // Questões q6, q7, ..., q15 seriam adicionadas da mesma forma.

        // Iterando sobre as questões para apresentá-las e processar as respostas
        for (Questao questao : questaos) {
            questao.escrevaQuestao();
            resp = questao.leiaResposta();
            if (questao.isCorreta(resp)) {
                cont++;
            }
        }
        double porcentagem = (cont / 15.0) * 100;

        // Contador de acertos
        System.out.println("Você acertou " + cont + " de respostas.");
        System.out.println("Você errou " + (15 - cont) + " de respostas.");
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", porcentagem) + "%");

        scanner.close();


    }
}
