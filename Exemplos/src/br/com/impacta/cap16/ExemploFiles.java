package br.com.impacta.cap16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class ExemploFiles {

    public static void main(String[] args) {

        Path base = Paths.get("exemplo-files");
        Path arquivo = base.resolve("resources").resolve("poema.txt");

        Path novaPasta = base.resolve(
            "resources/textos/rascunhos/vazio"
        );

        Path pasta = base.resolve("Mp3");

        try {
            // 1. Cria as pastas necessárias
            Files.createDirectories(arquivo.getParent());
            Files.createDirectories(novaPasta);
            Files.createDirectories(pasta);

            // 2. Cria o arquivo poema.txt, se não existir
            if (Files.notExists(arquivo)) {
                String poema = "Minha primeira experiência com a classe Files.";
                Files.writeString(
                    arquivo,
                    poema,
                    StandardCharsets.UTF_8
                );
                System.out.println("Arquivo poema.txt criado.");
            }

            // 3. Verifica o arquivo
            if (Files.exists(arquivo)) {
                if (Files.isDirectory(arquivo)) {
                    System.out.println("O item é um diretório.");
                } else if (Files.isRegularFile(arquivo)) {
                    System.out.println("O item é um arquivo.");
                }

                System.out.println(
                    "Tamanho: " + Files.size(arquivo) + " bytes"
                );
            }

            // 4. Cria arquivos de exemplo na pasta Mp3
            String[] nomes = {
                "BobDylan.mp3",
                "BondeDoTigrao.mp3",
                "BaraoVermelho.mp3"
            };

            for (String nome : nomes) {
                Path mp3 = pasta.resolve(nome);

                if (Files.notExists(mp3)) {
                    Files.createFile(mp3);
                }
            }

            // 5. Lista o conteúdo da pasta Mp3
            System.out.println("\nArquivos da pasta Mp3:");

            try (Stream<Path> arquivos = Files.list(pasta)) {
                arquivos.forEach(f ->
                    System.out.println(f.getFileName())
                );
            }

            System.out.println("\nEstrutura criada em:");
            System.out.println(base.toAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}