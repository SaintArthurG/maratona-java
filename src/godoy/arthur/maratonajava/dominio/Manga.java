package godoy.arthur.maratonajava.dominio;

public class Manga {
    private String nome;
    private int[] episodios;
    // 1- Alocado esáõ em memória para o objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 3- Bloco de init é executada
    // 4- Construtor é executado
    {
        System.out.println("Dentro do bloco de init");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+i;
        }
    }

    public Manga(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Manga() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();


    }
}
